/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ems.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Shabina
 */
public class Employee {
    private String Name;
    private Integer EmployeeId;
    private Integer Age;
    private String Gender;
    private Date StartDate;
    private String Level;
    private String TeamInfo;
    private String PositionTitle;
    private ArrayList ContactInfo;
    private String Photo;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getPositionTitle() {
        return PositionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.PositionTitle = PositionTitle;
    }

    public ArrayList getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(ArrayList ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    
    
    
}
