package Labquetions;
//create Emp details eid,ename,companyname using static variable,static method
public class Employe {
	private static int eidCounter = 1000; // Starting employee ID counter
    private static String companyName = "XYZ Company"; // Default company name
    
    private int eid; // Employee ID
    private String ename; // Employee Name

    public Employe(String ename) {
        this.eid = eidCounter++; // Assigning unique ID to each employee
        this.ename = ename;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static int getEidCounter() {
        return eidCounter;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public static void main(String[] args) {
        // Creating employees
        Employe emp1 = new Employe("John Doe");
        Employe emp2 = new Employe("Jane Smith");

        // Displaying employee details
        System.out.println("Company Name: " + Employe.getCompanyName());
        System.out.println("Employee 1: ID-" + emp1.getEid() + ", Name-" + emp1.getEname());
        System.out.println("Employee 2: ID-" + emp2.getEid() + ", Name-" + emp2.getEname());

        // Changing company name
        Employe.setCompanyName("ABC Corp");

        // Displaying updated company name
        System.out.println("Updated Company Name: " + Employe.getCompanyName());
    }

}
