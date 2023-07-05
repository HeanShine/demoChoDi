package manager;

public class ManagerLogin {
    UserManager userManager = new UserManager();

   public boolean isLogin(String userName, String password) {
        for (int i = 0; i < userManager.users.size(); i++) {
            if (userManager.users.get(i).getUserName().equals(userName) &&
                    userManager.users.get(i).getPassword().equals(password)) {
                System.out.println("Login successfully!");
                return true;
            }
        }
        System.err.println("Login failed!");
        return false;
    }


   public boolean isAdmin(String userName) {
        for (int i = 0; i < userManager.users.size(); i++) {
            if (userManager.users.get(i).getUserName().equals(userName) &&
                    userManager.users.get(i).getRole().equals("admin")) {
                System.out.println("Admin login successfully!");
                return true;
            }
        }
        System.err.println("Admin login failed!");
        return false;
    }
}
