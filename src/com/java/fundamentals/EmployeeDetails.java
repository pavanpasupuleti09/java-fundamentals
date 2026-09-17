package com.java.fundamentals;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int id = scanner.nextShort();
        System.out.println("Enter Age : ");
        byte age = scanner.nextByte();
        System.out.println("Enter Department Code : ");
        char departmentCode = scanner.next().charAt(0);
        System.out.println("Enter Salary : ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Employee Experience : ");
        short experience = scanner.nextShort();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Is Permanent");
        boolean isPermanment = scanner.nextBoolean();
        System.out.println("Enter Rating : ");
        float rating = scanner.nextFloat();
        System.out.println("--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Permanent: " + isPermanment);
        System.out.println("Rating: " + rating);


        scanner.close();
    }
}
