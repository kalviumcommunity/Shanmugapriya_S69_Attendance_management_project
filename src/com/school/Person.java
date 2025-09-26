package com.school;

public class Person {
    private static final java.util.concurrent.atomic.AtomicInteger nextIdCounter = new java.util.concurrent.atomic.AtomicInteger(1);
    protected int id;
    protected String name;

    public Person(String name) {
        this.id = nextIdCounter.getAndIncrement();
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
