package com.example.hpseahouse;

import java.io.Serializable;

public class LoginForm implements Serializable {

    private String id;
    private String pass;
    private String message;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }

}
