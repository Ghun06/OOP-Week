package BKT2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        Employees.add(new Employee("Vu", 12, 2.99, 100000.0));
        Employees.add(new Employee("Kien", 13, 3.0, 100000.0));
        Employees.add(new Employee("Hung", 14, 3.99, 100000.0));
        Employees.add(new Employee("Long", 15, 3.1, 100000.0));
        Employees.add(new Employee("Trung", 16, 3.2, 100000.0));

        for (int i = 0; i < Employees.size(); i++) {
            System.out.println("\n- Nhan Vien Ma: "+ Employees.get(i).getEmployeeID());
            System.out.print("Ten: "+ Employees.get(i).getName());
            System.out.print(" - Luong: "+ Employees.get(i).Salary());
        }

    }
}
