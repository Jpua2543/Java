package com.caresoft.clinicapp;

public class AdminUser {
    
    private int id;
    private String role;
    private int pin;
    
    // Constructor
    public AdminUser(int id, String role) {
        this.id = id;
        this.role = role;
        this.pin = -1; // default value indicating no pin set yet
    }
    
    public boolean assignPin(int pin) {
        if (pin >= 100000 && pin <= 999999) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean accessAuthorized(int pin) {
        if (this.pin == pin) {
            return true;
        }
        return false;
    }

    // ... Getter, Setter, and any other methods ...

    // Example: Reporting security incidents
    public String reportSecurityIncidents() {
        // ... Implement this according to your needs
        return "Sample security incident report for AdminUser.";
    }
}
