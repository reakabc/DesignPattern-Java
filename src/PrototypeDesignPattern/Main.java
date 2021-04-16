package PrototypeDesignPattern;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(201, "Ramesh", 8.9);
        Student s2 = (Student) s1.getClone();

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }

}
