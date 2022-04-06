package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static task3.Course.JAVA;
import static task3.Course.JAVA_SCRIPT;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Zahid", (byte) 18,JAVA),
                new Student("Azat", (byte) 15,JAVA_SCRIPT),
                new Student("Nurgazy", (byte) 25,JAVA),
                new Student("Kuba", (byte) 28,JAVA_SCRIPT),
                new Student("Ulan", (byte) 12,JAVA),
                new Student("Nurjan", (byte) 18,JAVA_SCRIPT),
                new Student("Nursultan", (byte) 14,JAVA),
                new Student("Altynbek", (byte) 36,JAVA_SCRIPT),
                new Student("Maksat", (byte) 42,JAVA),
                new Student("Azamat", (byte) 32,JAVA_SCRIPT),
                new Student("Turatbek", (byte) 26,JAVA),
                new Student("Kynzaada", (byte) 22,JAVA_SCRIPT),
                new Student("Aichurok", (byte) 29,JAVA),
                new Student("Myrzabek", (byte) 19,JAVA_SCRIPT),
                new Student("Almaz", (byte) 27,JAVA),
                new Student("Tologon", (byte) 24,JAVA_SCRIPT),
                new Student("Aijan", (byte) 25,JAVA),
                new Student("Ulanbek", (byte) 18,JAVA_SCRIPT),
                new Student("Bakyt", (byte) 37,JAVA),
                new Student("Melis", (byte) 21,JAVA_SCRIPT),
                new Student("Kenjebek", (byte) 33,JAVA));

        System.out.println("All students");
        printElementsOfArray(students);

//        System.out.println("Students of Java course:");
//        List<Student > javaCourse = sortCourseJava(students);
//        printElementsOfArray(javaCourse);
//
//        System.out.println("Students of Java Script course:");
//        List<Student > javaScriptCourse = sortCourseJavaScript(students);
//        printElementsOfArray(javaScriptCourse);

        System.out.println();

        System.out.println("Students of Java course:");
        List<Student > javaCourse = sortByCourseUniversal(students,JAVA);
        printElementsOfArray(javaCourse);

        System.out.println();

        System.out.println("Students of Java Script course:");
        List<Student > javaScriptCourse = sortByCourseUniversal(students,JAVA_SCRIPT);
        printElementsOfArray(javaScriptCourse);

        System.out.println();

        System.out.println("Students age only 18 up to 25");
        List<Student > filterByAge = sortByAge(students);
        printElementsOfArray(filterByAge);

        System.out.println();

        System.out.println("Students which name start the letter A");
        List<Student > filterByName = sortByNameA(students);
        printElementsOfArray(filterByName);

        System.out.println();

        System.out.println("Students age more than 30");
        List<Student> moreThanThirty = sortByAge30(students);
        printElementsOfArray(moreThanThirty);

        System.out.println();

        System.out.println("Students with K in name");
        List<Student> studentsWithKInName=sortByNameLetterA(javaScriptCourse);
        printElementsOfArray(studentsWithKInName);

        System.out.println();

        System.out.println("Remove the students whose age up to sixteen ");
        List<Student> removeStudents = removeStudentsWhoseAgeUpToSixteen(students);
        printElementsOfArray(removeStudents);


    }

    private static List<Student> removeStudentsWhoseAgeUpToSixteen(List<Student> students) {
        List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge()<16) {
                System.out.println(students.get(i));
                newArrayList.remove(students.get(i));
            }
        }
        return newArrayList;
    }

    private static List<Student> sortByNameLetterA(List<Student> students) {
        List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains("K") || students.get(i).getName().contains("k")) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }

    private static List<Student> sortByAge30(List<Student> students) {
        List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge()>30) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }

    private static List<Student> sortByNameA(List<Student> students) {
        List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().charAt(0)=='A'){
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }

    private static List<Student> sortByAge(List<Student> students) {
        List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge()>17 && students.get(i).getAge()<25) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }
    private static List<Student> sortCourseJava(List<Student> students) {
        ArrayList<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse().equals(JAVA)) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }

    private static List<Student> sortCourseJavaScript(List<Student> students) {
        ArrayList<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse().equals(JAVA_SCRIPT)) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }

    private static void printElementsOfArray(List<?> students) {
        for (Object a:students) {
            System.out.println(a);
        }
    }

    private static List<Student> sortByCourseUniversal(List<Student> students, Course course) {
      List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse().equals(course)) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }
}
