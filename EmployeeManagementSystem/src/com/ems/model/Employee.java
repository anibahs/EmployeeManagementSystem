/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ems.model;

import java.util.ArrayList;

/**
 *
 * @author Shabina
 */
public class Employee {
    private String Name;
    private int EmployeeId;
    private int Age;
    private String Gender;
    private String StartDate;
    private int Level;
    private String TeamInfo;
    private String PositionTitle;
    private ArrayList<String> ContactInfo;
    private String Photo;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
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
    
    @Override
    public String toString(){
        return Name;
    }
    
}
