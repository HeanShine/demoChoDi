package menu;

import entity.Classes;
import entity.Student;
import manager.ClassesManager;

import java.util.Scanner;

public class MenuAdmin {
    public ClassesManager classesManager = new ClassesManager();
    public Classes classes = new Classes();


    public void MenuClasses() {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                                                ֍🐾🐾🐾🐾🐾🐾🐾❚█══█❚🐾🐾🐾🐾🐾🐾🐾🐾֎
                                                𒁂         MENU CLASS ADMIN           𒁂
                                                〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓
                                                ✍ ✍ ✍ ✍         ⚆ _ ⚆         ✍ ✍ ✍ ✍
                                                ✅ 1. Thêm lớp học mới                ⚓
                                                ✅ 2. Sửa lớp học                     ⚓
                                                ✅ 3. Xóa lớp học                     ⚓
                                                ✅ 4. Hiển thị thông tin user         ⚓
                                                ✅ 5. Đăng Xuất                       ⚓
                                                ⏩===================================⏪
                                                 ❤ ᚐ  ᚑᚑ  ᚒᚒ  ᚓᚓ  ☑💖☑ ᚓᚓ  ᚒᚒ  ᚑᚑ  ᚐ  ❤
                                                💯===================================💯
                    """);

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Classes classes = new Classes();
                    classes.inputClass();
                    classesManager.addClass(classes);
                    break;
                case 2:
                    System.out.println("Enter id class update: ");
                    int idClass = scanner.nextInt();
                    Classes classes1 = new Classes();
                    classes1.inputClass();
                    classesManager.updateClass(idClass, classes1);
                    break;
                case 3:
                    System.out.println("Enter id class remove: ");
                    int idClassRemove = scanner.nextInt();
                    classesManager.removeClass(idClassRemove);
                    break;
                case 4:
                    classesManager.showAllClass();
                    MenuStudent();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    void MenuStudent() {
        int choice = -1;
        do {

            Scanner scanner = new Scanner(System.in);

            System.out.println("-----MENU STUDENT-----");
            System.out.println("1. Add new student");
            System.out.println("2. Update student");
            System.out.println("3. Remove student");
            System.out.println("4. Show  student in class");
            System.out.println("5. menu class");
            System.out.println("Enter your choice: ");
            System.out.println("""
                                                ֍🐾🐾🐾🐾🐾🐾🐾❚█══█❚🐾🐾🐾🐾🐾🐾🐾🐾֎
                                                𒁂        MENU HỌC SINH ADMIN                𒁂
                                                〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 
                                                ✍ ✍ ✍ ✍         ⚆ _ ⚆         ✍ ✍ ✍ ✍
                                                ✅ 1. Thêm học sinh vào lớp                   ⚓
                                                ✅ 2. Sửa học sinh trong lớp                  ⚓
                                                ✅ 3. Xóa học sinh trong lớp                  ⚓
                                                ✅ 4. Hiển thị thông tin học sinh trong lớp   ⚓
                                                ✅ 5. Hiển thị tất cả User                    ⚓
                                                ✅ 0. Trở về menu lớp học                     ⚓
                                                ⏩===================================⏪
                                                 ❤ ᚐ  ᚑᚑ  ᚒᚒ  ᚓᚓ  ☑💖☑ ᚓᚓ  ᚒᚒ  ᚑᚑ  ᚐ  ❤
                                                💯===================================💯
                    """);

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter name class add student : ");
                    String nameClass = scanner.nextLine();

                    Student student = new Student();
                    student.inputStudent();
                    classes.addStudentInClass(student, nameClass);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter id class update student : ");
                    int idClassUpdate = scanner.nextInt();
                    scanner.nextLine();
                    Student student1 = new Student();
                    student1.inputStudent();
                    classes.updateStudentInClass(idClassUpdate, student1);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter id class remove student : ");
                    int idClassRemove = scanner.nextInt();
                    scanner.nextLine();
                    classes.removeStudentInClass(idClassRemove);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter name class show student : ");
                    String nameClassShow = scanner.nextLine();

                    classes.showStudentInClass(nameClassShow);
                    break;
                case 5:
                    MenuClasses();
                    break;
                default:
                    System.err.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}



