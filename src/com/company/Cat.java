package com.company;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }
}
