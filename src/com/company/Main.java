package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Alex");
        names.add("Dmitry");
        names.add("Lenin");

        Collections.sort(names);
        for(String i: names) System.out.print(i + " ");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov",33));
        students.add(new Student("Aaaaaa",12));
        students.add(new Student("Petrov",17));
        students.add(new Student("Bbbbbb",35));
        students.add(new Student("Sidorov",50));

        Comparator<Student> sort_by_age = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // логика
                return o1.getAge()-o2.getAge();
            }
        };
        Collections.sort(students,sort_by_age);
        for(Student ii: students)
            System.out.println(ii.getAge() + ": "+ii.getName());

        // Collections.sort();
        // Arrays.sort();

        int[] a = {100,3,345,345,344,4,100};

        Arrays.sort(a);

        int result = Arrays.binarySearch(a,350);

        System.out.println(result);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Mursik",5));
        cats.add(new Cat("Barsik",6));
        cats.add(new Cat("Tuzik",2));

        Collections.sort(cats);

        
        for(Cat ii: cats)
            System.out.println(ii.getName());




    }
}
