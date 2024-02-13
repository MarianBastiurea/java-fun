package org.example.c04.inheritance;

public class StudentTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);

            Student pojoStudent = new Student("92306", "Ann", "05/05/1980",
                    "Java MasterClass");
            LPAStudent recordsStudent = new LPAStudent("92307", "Jim", "01/01/1980",
                    "Java MasterClass");
            System.out.println(pojoStudent);
            System.out.println(recordsStudent);

            pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

            System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
            System.out.println(recordsStudent.name() + " is taking " + recordsStudent.classList());
        }
    }
}
