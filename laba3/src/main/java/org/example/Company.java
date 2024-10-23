package org.example;
/*
@author   $Dzedzinskyi_Rostyslav
@project   $Company
@class  $444B
@since 19.10.2024 - 15.54
*/
public class Company {
    private Company parent; // Nullable if there is no parent
    private long employeeCount;

    // Constructor
    public Company(Company parent, long employeeCount) {
        this.parent = parent;
        this.employeeCount = employeeCount;
    }

    // Getters and Setters
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(long employeeCount) {
        this.employeeCount = employeeCount;
    }
}

