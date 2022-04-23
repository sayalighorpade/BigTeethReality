package com.BigTeethTv.Reality.entity;

import javax.persistence.*;


@Entity
@Table(name="app")
public class Application {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "app_id")
        private int app_id;
        @Column(name="first_name")
        public String first_name;

        @Column(name="last_name")
        public String last_name;

        @Column(name="address")
        public String address;

        @ManyToOne
        @JoinColumn(name= "area_id")
        public Area area_id;

        @Column(name="daytime_phone")
        public String daytime_phone;




    @Column(name="night_phone")
        public String night_phone;

        @Column(name="email")
        public String email;

        @Column(name="dob")
        public String dob;

        @Column(name="gender")
        public String gender;

        @Column(name="photo")
        public String photo;

        @Column(name="video_id")
        public String video_id;

        @Column(name="candidate_essay")
        public String candidate_essay;

        @Column(name="producer_rating")
        public int producer_rating;

        @Column(name="director_rating")
        public int director_rating;

   /* @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
*/
  /*  public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }*/

        public Application() {
        }
    @Override
    public String toString() {
        return "Application{" +
                "app_id=" + app_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", area_id=" + area_id +
                ", daytime_phone='" + daytime_phone + '\'' +
                ", night_phone='" + night_phone + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", photo='" + photo + '\'' +
                ", video_id='" + video_id + '\'' +
                ", candidate_essay='" + candidate_essay + '\'' +
                ", producer_rating=" + producer_rating +
                ", director_rating=" + director_rating +
                '}';
    }
    public int getApp_id() {
            return app_id;
        }

        public void setApp_id(int app_id) {
            this.app_id = app_id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }



        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public String getCandidate_essay() {
            return candidate_essay;
        }

        public void setCandidate_essay(String candidate_essay) {
            this.candidate_essay = candidate_essay;
        }

        public int getProducer_rating() {
            return producer_rating;
        }

        public void setProducer_rating(int producer_rating) {
            this.producer_rating = producer_rating;
        }

        public int getDirector_rating() {
            return director_rating;
        }

        public void setDirector_rating(int director_rating) {
            this.director_rating = director_rating;
        }
    public Area getArea_id() {
        return area_id;
    }

    public void setArea_id(Area area_id) {
        this.area_id = area_id;
    }

    public void setDaytime_phone(String daytime_phone) {
        this.daytime_phone = daytime_phone;
    }

    public void setNight_phone(String night_phone) {
        this.night_phone = night_phone;
    }

    public String getDaytime_phone() {
        return daytime_phone;
    }

    public String getNight_phone() {
        return night_phone;
    }
}
