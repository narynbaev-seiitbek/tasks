package task5;

import task3.Course;

import java.util.*;

import static task5.Group.JAVA;
import static task5.Group.JAVA_SCRIPT;

public class Main {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>(Arrays.asList(new Student("Azat", "azat@gmail.com", 28, JAVA),
                new Student("Seitbek", "seiitbek@gmail.com", 17, JAVA_SCRIPT),
                new Student("Habib", "habib@gmail.com", 25, JAVA),
                new Student("Altunbek", "altynbek@gmail.com", 28, JAVA_SCRIPT),
                new Student("Tologon", "tologon@gmail.com", 27, JAVA),
                new Student("Ulan", "ulan@gmail.com", 35, JAVA_SCRIPT),
                new Student("Maks", "maks@gmail.com", 18, JAVA),
                new Student("Talant", "talant@gmail.com", 38, JAVA_SCRIPT),
                new Student("Zahid", "zahid@gmail.com", 19, JAVA),
                new Student("Zahid", "zahid@gmail.com", 19, JAVA)));

               Set<Student> javaGroup = sortByCourseUniversal(students,JAVA_SCRIPT);
               Set<Student> javaScriptGroup = sortByCourseUniversal(students,JAVA);
        System.out.println(javaGroup);
        System.out.println(javaScriptGroup);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(students.size());

        Queue<Student> studentQueue = new PriorityQueue<>(students);

        Deque<Student> studentDeque = new ArrayDeque<>(studentQueue);

        Map<Group,Student> studentMap = new HashMap<>();


        for (Map.Entry entry: studentMap.entrySet()) {
            System.out.println(entry);
        }

    }

    private static Set<Student> sortByCourseUniversal(Set<Student> students, Group group) {
        Set<Student> newHashSet = new TreeSet<>();
        for (Student s:students) {
            if (s.getGroup().equals(group)) {
                newHashSet.add(s);
            }
        }
        return newHashSet;

    }
}
