package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {
        // BYTE
        byte age;
        age = 54;
        System.out.println(age);// here we print the data which in variable called age
        System.out.println("AGE : " + age);// here we print the data along with a description
        // SHORT
        short otp;
        short currentYear;
        short yearOfPassedOut,yearOfJoining;
        otp = 3245;
        currentYear = 2026;
        yearOfPassedOut = 2025;
        yearOfJoining = 2021;
        System.out.println("current year : " + currentYear);
        System.out.println("Year of joining : " + yearOfJoining  +  " ,  Year of passedout : " + yearOfPassedOut);
        System.out.println("OTP : " + otp);
        // INT
        int employeeId,salary;
        employeeId = 12221;
        salary = 45000;
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Salary : " + salary);
        // LONG
        long employeeBankNumber,employeeAdharNumber;
        employeeBankNumber = 656787898890990L;
        employeeAdharNumber = 312478657816L;
        System.out.println("Employee Bank : " + employeeBankNumber);
        System.out.println("Employee Adhar : " + employeeAdharNumber);
    }

    }


