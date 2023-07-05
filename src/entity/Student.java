package entity;

import java.util.Scanner;

public class Student {

    private static int nextId = 1;
    private int idStudent;
    private String nameStudent;
    private int idClass;
    private String addressStudent;
    private String phoneStudent;
    private String emailStudent;

    public Student() {
        this.idStudent = nextId++;
    }

    public Student(String nameStudent, String addressStudent, String phoneStudent, String emailStudent) {
        this.nameStudent = nameStudent;
        this.addressStudent = addressStudent;
        this.phoneStudent = phoneStudent;
        this.emailStudent = emailStudent;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public String getPhoneStudent() {
        return phoneStudent;
    }

    public void setPhoneStudent(String phoneStudent) {
        this.phoneStudent = phoneStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name student: ");
        this.nameStudent = sc.nextLine();

        System.out.print("Enter address student: ");
        this.addressStudent = sc.nextLine();

        System.out.print("Enter phone student: ");
        this.phoneStudent = sc.nextLine();

        System.out.print("Enter email student: ");
        this.emailStudent = sc.nextLine();
    }

    public void showStudent() {
        System.out.println("Id student: " + this.idStudent);
        System.out.println("Name student: " + this.nameStudent);
        System.out.println("Address student: " + this.addressStudent);
        System.out.println("Phone student: " + this.phoneStudent);
        System.out.println("Email student: " + this.emailStudent);
    }
}
