package PrototypeDesignPattern;

public class Student implements Prototype{

    private int rollNo;
    private String name;
    private double CGPA;

    public Student(int rollNo, String name, double CGPA) {
        this.rollNo = rollNo;
        this.name = name;
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }

    @Override
    public Prototype getClone() {
        return new Student(rollNo, name, CGPA);
    }
}
