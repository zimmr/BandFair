package zimmer.bandfair.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Musician implements Serializable {
    private String name;
    private String username;
    private String email;
    private String password;
    private String birthDate;
    private int sex;
    private String city;
    private String state;
    private ArrayList<String> instruments;
    private ArrayList<String> genres;
//    private int Year;

    public Musician() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String year, String month, String day) {
        this.birthDate = year + "-" + month + "-" + day;
    }

    public String getSex() {
        if (this.sex == 0){
            return "Female";
        } else if (this.sex == 1){
            return "Male";
        } else {
            return "";
        }
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<String> instruments) {
        this.instruments = instruments;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

//    public int calculateAge(){}

    @Override
    public String toString() {
        return  " | " + sex + " | " + this.city + " / " + this.state;
    }
}
