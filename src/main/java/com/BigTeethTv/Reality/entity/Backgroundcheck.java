package com.BigTeethTv.Reality.entity;

import javax.persistence.*;
@Entity
public class Backgroundcheck {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "national_id")
    private int national_id;
    private String religion;
    private int appearance_rating;
    private int strength_rating;
    @ManyToOne
    @JoinColumn(name= "app_id")
    private Application app_id;

    @Override
    public String toString() {
        return "Backgroundcheck{" +
                "national_id=" + national_id +
                ", religion='" + religion + '\'' +
                ", appearance_rating=" + appearance_rating +
                ", strength_rating=" + strength_rating +
                ", app_id=" + app_id +
                '}';
    }

    public Backgroundcheck() {
    }

    public int getNational_id() {
        return national_id;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getAppearance_rating() {
        return appearance_rating;
    }

    public void setAppearance_rating(int appearance_rating) {
        this.appearance_rating = appearance_rating;
    }

    public int getStrength_rating() {
        return strength_rating;
    }

    public void setStrength_rating(int strength_rating) {
        this.strength_rating = strength_rating;
    }

    public Application getApp_id() {
        return app_id;
    }

    public void setApp_id(Application app_id) {
        this.app_id = app_id;
    }
}
