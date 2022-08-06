package section02_JavaBasicsExtended.topic05_Classes.practice.GetPercentOfEmployedStudent;

import static section02_JavaBasicsExtended.topic05_Classes.practice.GetPercentOfEmployedStudent.GetPercentOfEmployedStudent.getPercentOfEmployedStudent;

public class Main {
    public static void main(String[] args) {
        Student[] array = new Student[]{
                new Student("Anna", "Kyts", 22, true),
                new Student("Victor", "Shvets", 45, false),
                new Student("Ira", "Melnyk", 18, true),
                new Student("Vasil", "Koval", 29, false),
                new Student("Stas", "Litvin", 41, true),
                new Student("Alina", "Ivanova", 33, true),
                new Student("Ivan", "Petrov", 31, true),
                new Student("Irina", "Stetsenko", 30, true),
                new Student("Yurii", "Shvets", 40, true),
                new Student("Olha", "Kulyk", 37, true)
        };

        Student[] array1 = new Student[]{
                new Student("Anna", "Kyts", 22, true),
                new Student("Victor", "Shvets", 45, false),
                new Student("Ira", "Melnyk", 18, true),
                new Student("Vasil", "Koval", 29, false),
                new Student("Stas", "Litvin", 41, true),
                new Student("Alina", "Ivanova", 33, true),
                new Student("Ivan", "Petrov", 31, false),
                new Student("Irina", "Stetsenko", 30, false),
                new Student("Yurii", "Shvets", 40, false),
                new Student("Olha", "Kulyk", 37, false)
        };

        Student[] array2 = new Student[]{
                new Student("Anna", "Kyts", 22, true),
                new Student("Victor", "Shvets", 45, false),
                new Student("Ira", "Melnyk", 18, true),
                new Student("Vasil", "Koval", 29, false),
                new Student("Stas", "Litvin", 41, true),
                new Student("Alina", "Ivanova", 33, false),
                new Student("Ivan", "Petrov", 31, false),
                new Student("Irina", "Stetsenko", 30, false),
                new Student("Yurii", "Shvets", 40, false),
                new Student("Olha", "Kulyk", 37, false)
        };

        Student[] array3 = new Student[]{
                new Student("Anna", "Kyts", 22, true),
                new Student("Victor", "Shvets", 45, false),
                new Student("Ira", "Melnyk", 18, true),
                new Student("Vasil", "Koval", 29, false),
                new Student("Stas", "Litvin", 41, true),
                new Student("Alina", "Ivanova", 33, true),
                new Student("Ivan", "Petrov", 31, false),
                new Student("Irina", "Stetsenko", 30, true),
                new Student("Yurii", "Shvets", 40, false),
                new Student("Olha", "Kulyk", 37, true)
        };
       System.out.println(getPercentOfEmployedStudent(array));
        System.out.println(getPercentOfEmployedStudent(array1));
        System.out.println(getPercentOfEmployedStudent(array2));
        System.out.println(getPercentOfEmployedStudent(array3));
    }
}