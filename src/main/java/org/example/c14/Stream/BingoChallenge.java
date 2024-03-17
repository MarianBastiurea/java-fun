package org.example.c14.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoChallenge {

    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
            }
            start += 15;
        }

        Collections.shuffle(bingoPool);

        System.out.println("First stream: ");
        // first stream
        var firstStream = bingoPool.stream()
                .limit(15)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted();
        firstStream.forEach(s-> System.out.print(s + " "));
        System.out.println("\n----------------------------------");

        //remove first stream from bingoPool
        bingoPool.remove(firstStream);
        System.out.println("bingoPool after remove first stream:"+ bingoPool);

    }
}
