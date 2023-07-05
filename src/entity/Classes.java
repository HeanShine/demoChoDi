package entity;

import manager.ClassesManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
    private static int nextId = 1;
    private int idClass;
    private String nameClass;
    private int numberStudent;
    private ArrayList<Student> students;

    public Classes() {
        this.idClass = nextId++;
        this.students = new ArrayList<>();

    }

    public Classes(String nameClass, int numberStudent, ArrayList<Student> students) {
        this.nameClass = nameClass;
        this.numberStudent = numberStudent;
        this.students = new ArrayList<>();
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Classes.nextId = nextId;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public void inputClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        this.nameClass = scanner.nextLine();


        System.out.println("Nhập số sinh viên: ");
        this.numberStudent = scanner.nextInt();

        this.students = new ArrayList<>();
        for (int i = 0; i < this.numberStudent; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            Student student = new Student();
            student.inputStudent();
            this.students.add(student);
            System.out.println("--------------------");
        }
    }

    boolean isExisted(String nameClass) {
        for (Classes classes : ClassesManager.classes) {
            if (classes.getNameClass().equalsIgnoreCase(nameClass)) {
                return true;
            }
        }
        return false;
    }

     Classes isSearchClasses(String nameClass) {
         for (Classes classes : ClassesManager.classes) {
             if (classes.getNameClass().equalsIgnoreCase(nameClass)) {
                 return classes;
             } else {
                 return null;
             }
         }
         return null;
     }
    public void addStudentInClass(Student student , String nameClass) {
        if (isExisted(nameClass)) {
           isSearchClasses(nameClass).getStudents().add(student);
            System.out.println("Thêm sinh viên thành công!");
        } else {
            System.out.println("Ten lop khong ton tai! ");
        }
    }

    public void removeStudentInClass(int idStudent) {
        for(int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getIdStudent() == idStudent) {
                this.students.remove(i);
                System.out.println("Xóa sinh viên thành công!");
                return;
            }
            System.err.println("Không tìm thấy sinh viên!");
        }
    }

    public void updateStudentInClass(int idStudent, Student student) {
        for(int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getIdStudent() == idStudent) {
                this.students.set(i, student);
                System.out.println("Cập nhật sinh viên thành công!");
                return;
            }
            System.err.println("Không tìm thấy sinh viên!");
        }
    }

    public void searchStudentInClass(String nameStudent) {
        for(int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getNameStudent().equalsIgnoreCase(nameStudent)) {
                this.students.get(i).showStudent();
                return;
            }
            System.err.println("Không tìm thấy sinh viên!");
        }
    }

    public void showStudentInClass(String nameClass) {
        for (Classes classes : ClassesManager.classes) {
            if (classes.getNameClass().equalsIgnoreCase(nameClass)) {
                for (Student student : classes.getStudents()) {
                    student.showStudent();
                    System.out.println("--------------------");
                }
                return;
            }
        }
        System.err.println("Không tìm thấy lớp!");
    }

    public void showClass() {
        System.out.println("Mã lớp: " + this.idClass);
        System.out.println("Tên lớp: " + this.nameClass);
        System.out.println("Số sinh viên: " + this.numberStudent);
        for (Student student : this.students) {
            student.showStudent();
            System.out.println("--------------------");
        }
    }
}
