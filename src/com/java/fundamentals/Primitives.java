package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {
     // INTEGERS
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


     // REALS
        float discountPercentage;
        discountPercentage = 10.6F;
        double averagePrice ;
        averagePrice = 2345.67;
        System.out.println(discountPercentage);
        System.out.println(averagePrice);

     // CHAR
        char gender;
        char membership;
        gender = 'M'; // maps to ASCII code 77
        membership = 'G'; // maps to ASCII code 71
        System.out.println("Gender : " + gender);
        System.out.println("MemberShip : " + membership);
        char ch1;
        char ch2;
        ch1 = 1;  // here we store the ascii value of 1
        ch2 = '1';  // here we store the letter 1
        System.out.println(ch1);
        System.out.println(ch2);

        // BOOlEAN
        boolean isAvailable;
        isAvailable = true;
        System.out.println(isAvailable);
    }

    }


