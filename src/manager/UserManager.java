package manager;

import entity.User;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();

    public UserManager() {

    }
    boolean isUser(String nameUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(nameUser)) {
                return true;
            }
        }
        return false;
    }

    public void register(User user) {
        if (isUser(user.getUserName())) {
            System.out.println("User is exist");
        } else {
            users.add(user);
        }
    }

    public void removeUser(String userName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                users.remove(users.get(i));
                System.out.println("Remove user successfully!");
                return;
            }
        }
        System.err.println("User not found!");
    }

    public void changeAccount(String userName, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                // giu nguyen username
                users.get(i).setPassword(password);
                System.out.println("Update user successfully!");
                return;
            }
        }
        System.err.println("User not found!");
    }

    public void showAllUser() {
        if (users.isEmpty()) {
            System.out.println("List user is empty");
        } else {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("User " + (i + 1) + ": ");
                users.get(i).showUser();
                System.out.println("-----------------");
            }
        }
    }
}

