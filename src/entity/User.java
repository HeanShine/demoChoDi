package entity;

import java.util.Scanner;

public class User {
    private static int nextId = 1;
    private int idUser;
    private String userName;
    private String password;
    private String Role;

    public User() {
        this.idUser = nextId++;
    }

    public User(int idUser, String userName, String password, String Role) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.Role = Role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public void inputUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name: ");
        this.userName = scanner.nextLine();

        System.out.println("Enter password: ");
        this.password = scanner.nextLine();

        String regexRole = "^(admin|member)$";

        while (true) {
            System.out.println("Enter role: ");
            this.Role = scanner.nextLine();
            if (this.Role.matches(regexRole)) {
                break;
            } else {
                System.out.println("Role is not valid");
            }
        }
    }

    public void showUser() {
        System.out.println("Id user: " + this.idUser);
        System.out.println("User name: " + this.userName);
        System.out.println("Password: " + this.password);
        System.out.println("Role: " + this.Role);
    }
}

