package oops;

import oops.pkg_1.Student;

class Emoloyee{
     int id;
    String name;
    int phoneNo;
    String dept;
}
public class OOPBasics {
    public static void main(String[] args) {

// Creating object of Employee class
        Emoloyee emp = new Emoloyee();

// assigning the values reference variable
        emp.id = 1;
        emp.name = "User";
        emp.dept = "sales";
        emp.phoneNo = 123;
        System.out.println(emp.id);
        System.out.println(emp.name);
        System.out.println(emp.dept);
        System.out.println(emp.phoneNo);

        Student st = new Student();
        System.out.println(st.getName());
    }
}
