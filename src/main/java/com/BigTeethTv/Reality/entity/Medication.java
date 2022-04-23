package com.BigTeethTv.Reality.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medication_id")
    private int medication_id;
    @Column(name="medication_name")
    private String medication_name;

    @Override
    public String toString() {
        return "Medication{" +
                "medication_id=" + medication_id +
                ", medication_name='" + medication_name + '\'' +
                '}';
    }

    public Medication() {
    }

    public int getMedication_id() {
        return medication_id;
    }

    public void setMedication_id(int medication_id) {
        this.medication_id = medication_id;
    }

    public String getMedication_name() {
        return medication_name;
    }

    public void setMedication_name(String medication_name) {
        this.medication_name = medication_name;
    }
}
