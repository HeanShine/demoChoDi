package manager;

import entity.Classes;

import java.util.ArrayList;

public class ClassesManager {
    public static ArrayList<Classes> classes = new ArrayList<>();


    public boolean isExisted(String nameClass) {
        for (Classes classes1 : classes) {
            if (classes1.getNameClass().equalsIgnoreCase(nameClass)) {
                return true;
            }
        }
        return false;
    }

    // add new class
    public void addClass(Classes classes1) {
        if (isExisted(classes1.getNameClass())) {
            System.out.println("Class name is existed!");
        } else {
            classes.add(classes1);
        }
    }

    public void removeClass(int idClassCheck) {
        for (Classes classes1 : classes) {
            if (classes1.getIdClass() == idClassCheck) {
                classes.remove(classes1);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.err.println("Xoa that bai !");
    }

    public void updateClass(int idClassCheck, Classes classes1) {
        for (Classes classes2 : classes) {
            if (classes2.getIdClass() == idClassCheck) {
                classes2.setNameClass(classes1.getNameClass());
                classes2.setNumberStudent(classes1.getNumberStudent());
                classes2.setStudents(classes1.getStudents());

                System.out.println("Update class successfully!");
                return;
            }
        }
        System.err.println("Class not found!");
    }

    public void showAllClass() {
        if (classes.isEmpty()) {
            System.err.println("List class is empty!");
        } else {
            for (Classes classes1 : classes) {
                classes1.showClass();
                System.out.println("-----------------");
            }
        }
    }
}
