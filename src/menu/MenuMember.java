package menu;
import entity.Classes;
import manager.ClassesManager;

import java.util.Scanner;

public class MenuMember {

    public ClassesManager classesManager = new ClassesManager();
    public Classes classes = new Classes();
    Scanner scanner = new Scanner(System.in);
    public void MenuClasses() {
        int choice;
        do {

            System.out.println("-----MENU CLASS-----");
            System.out.println("4. Show all class");
            System.out.println("5. Menu User");
            System.out.println("Enter your choice: ");

            System.out.println("""
                                                ֍🐾🐾🐾🐾🐾🐾🐾❚█══█❚🐾🐾🐾🐾🐾🐾🐾🐾֎
                                                𒁂            MENU USER                𒁂
                                                〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓
                                                ✍ ✍ ✍ ✍         ⚆ _ ⚆         ✍ ✍ ✍ ✍
                                                ✅ 1. Hiển thị tất cả các lớp         ⚓
                                                ✅ 2. Trở về menu User                ⚓
                                                ⏩===================================⏪
                                                 ❤ ᚐ  ᚑᚑ  ᚒᚒ  ᚓᚓ  ☑💖☑ ᚓᚓ  ᚒᚒ  ᚑᚑ  ᚐ  ❤
                                                💯===================================💯
                    """);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    classesManager.showAllClass();
                    MenuStudent();
                    break;
                case 2:
                    MenuUser menuUser = new MenuUser();
                    menuUser.MenuUser();
                    break;
                default:
                    System.err.println("Invalid choice!");
            }
        } while (choice != 2);
    }

    public void MenuStudent() {
        int choice = -1;
        do {
            System.out.println("-----MENU STUDENT-----");
            System.out.println("1. Show student in class");
            System.out.println("2. Menu Classes");
            System.out.println("Enter your choice: ");
            System.out.println("""
                                                ֍🐾🐾🐾🐾🐾🐾🐾❚█══█❚🐾🐾🐾🐾🐾🐾🐾🐾֎
                                                𒁂            MENU USER                𒁂
                                                〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓
                                                ✍ ✍ ✍ ✍         ⚆ _ ⚆         ✍ ✍ ✍ ✍
                                                ✅ 1. Hiển thị các học sinh trong lớp học   ⚓
                                                ✅ 2. Trở về menu lớp học                   ⚓
                                                ⏩===================================⏪
                                                 ❤ ᚐ  ᚑᚑ  ᚒᚒ  ᚓᚓ  ☑💖☑ ᚓᚓ  ᚒᚒ  ᚑᚑ  ᚐ  ❤
                                                💯===================================💯
                    """);

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter name class: ");
                    String nameClass = scanner.nextLine();
                    classes.showStudentInClass(nameClass);
                    break;
                case 2:
                    MenuClasses();
                    break;
                default:
                    System.err.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
