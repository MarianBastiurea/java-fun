package org.example.c17inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReadingAFileChallenge {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("testfile.txt"))) {

//            System.out.printf(" %,d lines in file%n", br.lines().count());

            Pattern splitToWords = Pattern.compile("\\p{javaWhitespace}+");
//            System.out.printf("%,d words in file%n",
//                    br.lines()
////                            .flatMap(splitToWords::splitAsStream)
//                            .flatMap(l -> Arrays.stream(l.split(splitToWords.toString())))
//                            .count());

//            System.out.printf("%,d words in file%n",
//                    br.lines()
//                            .mapToLong(l -> l.split(splitToWords.toString()).length)
//                            .sum());

            List<String> excluded = List.of(
                    "grand",
                    "canyon",
                    "retrieved",
                    "archived",
                    "service",
                    "original");
            var result = br.lines()
                    .flatMap(splitToWords::splitAsStream)
                    .map(w -> w.replaceAll("\\p{Punct}", ""))
                    .filter(w -> w.length() > 4)
                    .map(String::toLowerCase)
                    .filter(w -> !excluded.contains(w))
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

            result.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue,
                            Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(e -> System.out.println(
                            e.getKey() + " - " + e.getValue() + " times"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------");
        String input = null;
        try {
            input = Files.readString(Path.of("testfile.txt"));
            input = input.replaceAll("\\p{Punct}", "");

            Pattern splitInWordsWithMoreThan5Char = Pattern.compile("\\w{5,}");
            Matcher matcher = splitInWordsWithMoreThan5Char.matcher(input);
            Map<String, Long> results = new HashMap<>();
            while (matcher.find()) {
                String word = matcher.group().toLowerCase();
//                if (word.length() > 4) {
                results.merge(word, 1L, (o, n) -> o += n);
//                }
            }

            var sortedEntries = new ArrayList<>(results.entrySet());
            sortedEntries.sort(Comparator.comparing
                    (Map.Entry::getValue, Comparator.reverseOrder()));
            for (int i = 0; i < Math.min(10, sortedEntries.size()); i++) {
                var entry = sortedEntries.get(i);
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
