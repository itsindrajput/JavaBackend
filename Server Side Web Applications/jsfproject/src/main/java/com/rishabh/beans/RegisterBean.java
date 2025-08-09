package com.rishabh.beans;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;

@SuppressWarnings("deprecation")
@ManagedBean(name = "registerBean")
@SessionScoped
public class RegisterBean implements Serializable {
    private String name;
    private String email;
    private String password;
    private String course;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String register() {
        return "success.xhtml?faces-redirect=true";
    }
}
