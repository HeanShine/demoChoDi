package menu;

import entity.User;
import manager.ManagerLogin;
import manager.UserManager;

import java.util.Scanner;

public class MenuUser {
    public  UserManager userManager = new UserManager();
    public  ManagerLogin managerLogin = new ManagerLogin();
    public MenuAdmin menuAdmin = new MenuAdmin();
    public MenuMember menuMember = new MenuMember();

    public void MenuUser() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                                                ֍🐾🐾🐾🐾🐾🐾🐾❚█══█❚🐾🐾🐾🐾🐾🐾🐾🐾֎
                                                𒁂            MENU USER                𒁂
                                                〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓 〓
                                                ✍ ✍ ✍ ✍         ⚆ _ ⚆         ✍ ✍ ✍ ✍
                                                ✅ 1. Đăng ký                    ⚓
                                                ✅ 2. Đăng nhập                  ⚓
                                                ✅ 3. Đổi tài khoản         ⚓
                                                ✅ 4. Xóa thông tin User         ⚓
                                                ✅ 5. Hiển thị tất cả User       ⚓
                                                ✅ 0. Exit                       ⚓
                                                ⏩===================================⏪
                                                 ❤ ᚐ  ᚑᚑ  ᚒᚒ  ᚓᚓ  ☑💖☑ ᚓᚓ  ᚒᚒ  ᚑᚑ  ᚐ  ❤
                                                💯===================================💯
                    """);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    User user = new User();
                    user.inputUser();

                    userManager.register(user);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter username: ");
                    String username = scanner.nextLine();

                    System.out.println("Enter password: ");
                    String password = scanner.nextLine();

                    if (managerLogin.isLogin(username, password) == true) {
                        if (managerLogin.isAdmin(username) == true) {
                            menuAdmin.MenuClasses();
                        } else {
                           menuMember.MenuClasses();
                        }
                    } else {
                        System.out.println("Login fail!");
                    }

                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter username: ");
                    String usernameChange = scanner.nextLine();

                    System.out.println("Enter password: ");
                    String passwordChange = scanner.nextLine();
                    userManager.changeAccount(usernameChange, passwordChange);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter username: ");
                    String usernameRemove = scanner.nextLine();

                    userManager.removeUser(usernameRemove);
                    break;
                case 5:
                    userManager.showAllUser();
                    break;
                case 0:
                    System.out.println("Exit!");
                    break;
                default:
                    System.err.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
    }
}
