package edu.jpa.TABLE_PER_CLASS.entity;

import jakarta.persistence.Entity;
@Entity
public class Executive extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
