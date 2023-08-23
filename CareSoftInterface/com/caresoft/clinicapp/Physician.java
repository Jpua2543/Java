package com.caresoft.clinicapp;
import com.caresoft.clinicapp.Physician;


public class Physician {
    
    private int id;
    private int pin;
    
    // Constructor
    public Physician(int id) {
        this.id = id;
        this.pin = -1; // default value indicating no pin set yet
    }
    
    public boolean assignPin(int pin) {
        if (pin >= 0 && pin <= 9999) {
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

}
