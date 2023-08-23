package com.caresoft.clinicapp;
import com.caresoft.clinicapp.Physician;
import com.caresoft.clinicapp.AdminUser;

public class Test {
    
    public static void main(String[] args) {
        //.. Main method set up ... //
        Physician doctor10 = new Physician(1);
        AdminUser roseTyler = new AdminUser(2, "Companion");
        AdminUser donnaNoble = new AdminUser(3, "Companion");
        
        // Physician Implementation Tests 
        System.out.println("\n========== Physician Tests ==========\n");
        boolean result = doctor10.assignPin(42);
        System.out.printf("Physician pin assign test 1: %s\n", result ? "PASS" : "FAIL");
        
        result = doctor10.assignPin(4000);
        System.out.printf("Physician pin assign test 2: %s\n", result ? "PASS" : "FAIL");
        
        result = doctor10.accessAuthorized(1234);
        System.out.printf("Physician auth test 1: %s\n", result ? "FAIL" : "PASS");
        
        result = doctor10.accessAuthorized(1);
        System.out.printf("Physician auth test 2: %s\n", result ? "PASS" : "FAIL");
        
        System.out.println("\n========== AdminUser Tests ==========\n");
        result = roseTyler.assignPin(42);
        System.out.printf("Admin pin assign test 1: %s\n", result ? "FAIL" : "PASS");
        
        result = roseTyler.assignPin(424242);
        System.out.printf("Admin pin assign test 2: %s\n", result ? "PASS" : "FAIL");
        
        result = roseTyler.accessAuthorized(1234);
        System.out.printf("Admin auth test 1: %s\n", result ? "FAIL" : "PASS");
        
        result = roseTyler.accessAuthorized(1234);
        System.out.printf("Admin auth test 2: %s\n", result ? "FAIL" : "PASS");
        
        result = roseTyler.accessAuthorized(2);
        System.out.printf("Admin auth test 3: %s\n\n", result ? "PASS" : "FAIL");
        
        donnaNoble.accessAuthorized(42);
        donnaNoble.accessAuthorized(4321);
        donnaNoble.accessAuthorized(7);
        donnaNoble.accessAuthorized(28);
        
        System.out.println(donnaNoble.reportSecurityIncidents());
    }
}
