package com.oyatech.roomfamouspeople;

public class Users {
    private int id ;
    private String firstName;
    private String secondName;
    private String email;

    public Users(int pId, String pFirstName, String pSecondName, String pEmail) {
        id = pId;
        firstName = pFirstName;
        secondName = pSecondName;
        email = pEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String pFirstName) {
        firstName = pFirstName;
    }

    public void setSecondName(String pSecondName) {
        secondName = pSecondName;
    }

    public void setEmail(String pEmail) {
        email = pEmail;
    }
}
