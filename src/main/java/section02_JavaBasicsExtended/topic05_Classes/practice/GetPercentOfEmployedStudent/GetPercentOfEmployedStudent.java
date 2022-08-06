package section02_JavaBasicsExtended.topic05_Classes.practice.GetPercentOfEmployedStudent;

public class GetPercentOfEmployedStudent {
    public static double getPercentOfEmployedStudent(Student[] studentsInfo) {
        double result = 0;
        double students = studentsInfo.length;

        for (Student person : studentsInfo){
            if (person.age < 30 || person.age > 40) {
                students--;
            }

            if (person.isEmployed && person.age >= 30 && person.age <= 40){
                result++;
            }
        }
        return result / students;
    }
}
