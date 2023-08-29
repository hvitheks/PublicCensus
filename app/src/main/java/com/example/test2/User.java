package com.example.test2;

public class User {
    public String second_name, first_name, patronymic, gender, birthDate, wedlock, birthPlace, ruLang,
            anyLang, nativeLang, citizenship, nationality, education, educationNow, home, homeSquare;

    public User() {
    }

    public User(String second_name, String first_name, String patronymic, String gender, String birthDate, String wedlock, String birthPlace, String ruLang,
                String anyLang, String nativeLang, String citizenship, String nationality, String education, String educationNow, String home, String homeSquare) {
        this.second_name = second_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthDate = birthDate;
        this.wedlock = wedlock;
        this.birthPlace = birthPlace;
        this.ruLang = ruLang;
        this.anyLang = anyLang;
        this.nativeLang = nativeLang;
        this.citizenship = citizenship;
        this.nationality = nationality;
        this.education = education;
        this.educationNow = educationNow;
        this.home = home;
        this.homeSquare = homeSquare;

    }
}
