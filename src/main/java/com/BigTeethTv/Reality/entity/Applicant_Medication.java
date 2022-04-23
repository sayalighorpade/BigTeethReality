package com.BigTeethTv.Reality.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Applicant_Medication {
    @OneToMany
    @JoinColumn(name= "app_id")
    private int app_id;
    @ManyToOne
    @JoinColumn(name= "medication_id")
    private Medication  medication_id;

    @Override
    public String toString() {
        return "Applicant_Medication{" +
                "app_id=" + app_id +
                ", medication_id=" + medication_id +
                ", reason='" + reason + '\'' +
                '}';
    }

    public Applicant_Medication() {
    }

    private String reason;

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public Medication getMedication_id() {
        return medication_id;
    }

    public void setMedication_id(Medication medication_id) {
        this.medication_id = medication_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
