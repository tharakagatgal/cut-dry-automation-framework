package com.cutanddry.qa.data.models;


import lombok.Data;

@Data
public class User {
    private String emailOrMobile;
    private String password;
}
