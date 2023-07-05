package manager;

import entity.Classes;
import entity.Student;
import entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ClassesManager classesManager = new ClassesManager();
//
//        Classes classes1 = new Classes();
//        classes1.inputClass();
//        classesManager.addClass(classes1);
//
//        Classes classes2 = new Classes();
//        classes2.inputClass();
//        classesManager.addClass(classes2);
//
//        System.out.println("Enter id class: ");
//        int idClassCheck = new Scanner(System.in).nextInt();


        //  classesManager.showAllClass();

        //  System.out.println("Enter id student: ");
        // int idStudentChekc = new Scanner(System.in).nextInt();
        //  Scanner scanner = new Scanner(System.in);
        //  String nameStudentCheck = scanner.nextLine();

        //  classes.searchStudentInClass(nameStudentCheck);
//        Student student = new Student();
//        student.setIdStudent(idStudentChekc);
//        student.inputStudent();
//       classes.updateStudentInClass(idStudentChekc, student);

        //    classesManager.showAllClass();

        UserManager userManager = new UserManager();
        ManagerLogin managerLogin = new ManagerLogin();

        User user = new User();
        user.inputUser();
        userManager.register(user);

        userManager.showAllUser();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name: ");
        String userName = scanner.nextLine();


        System.out.println("Enter password: ");
        String password = scanner.nextLine();


        if (managerLogin.isLogin(userName, password)) {
            if (managerLogin.isAdmin(userName)) {
                System.out.println("menu cho admin");
            } else if (managerLogin.isAdmin(userName)){
                System.out.println("menu cho user");
            }
        } else {
            System.out.println("Login fail");
        }
    }
}