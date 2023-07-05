
import entity.Classes;
import entity.Student;
import manager.ClassesManager;

import java.lang.management.ManagementFactory;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ClassesManager classesManager = new ClassesManager();

        Classes classes = new Classes();
        classes.inputClass();
        classesManager.addClass(classes);

        classesManager.showAllClass();

        System.out.println("nhap lop hoc can them sinh vien:");
        Scanner scanner = new Scanner(System.in);
        String nameClass = scanner.nextLine();

        Student student = new Student();
        student.inputStudent();
        classes.addStudentInClass(student, nameClass);

        classesManager.showAllClass();

        System.out.println("nhap lop hoc tim sinh vien:");
        String nameClassCheck = scanner.nextLine();
        classes.showStudentInClass(nameClassCheck);

//        System.out.println("nhap lop hoc can them sinh vien:");
//        Scanner scanner = new Scanner(System.in);
//        String nameClass = scanner.nextLine();
//
//        Student student = new Student();
//        student.inputStudent();
//
//
//        classesManager.addClass(classes1);
//
//        classesManager.showAllClass();
//
//        System.out.println("nhap lop hoc tim sinh vien:");
//        String nameClassCheck = scanner.nextLine();
//        classes.showStudentInClass(nameClassCheck);
    }
}