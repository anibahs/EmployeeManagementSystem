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
public class EmployeeDirectory {

    private ArrayList<Employee> directory;
    
    public EmployeeDirectory() {
        this.directory = new ArrayList<Employee>();
    }    
    
    public ArrayList<Employee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Employee> directory) {
        this.directory = directory;
    }
    
    public Employee addNewEmployee() {
        Employee newEmployee = new Employee();
        newEmployee.setEmployeeId(directory.size()+1);
        directory.add(newEmployee);
        return newEmployee;
    }

    public void deleteEmployee(Employee employee) {
        directory.remove(employee);
    }

    
    
    public void updateEmployee(Employee selectedEmployee, Employee updatedEmployee) {
        if(selectedEmployee.equals(updatedEmployee)){
            //do nothing
        }else{
            if(!selectedEmployee.getName().equals(updatedEmployee.getName())){
                selectedEmployee.setName(updatedEmployee.getName());
            }
            if(selectedEmployee.getEmployeeId()!= updatedEmployee.getEmployeeId()){
                //not allowed
            }
            if(selectedEmployee.getAge() != updatedEmployee.getAge()){
                selectedEmployee.setAge(updatedEmployee.getAge());
            }
            if(!selectedEmployee.getGender().equals(updatedEmployee.getGender())){
                selectedEmployee.setGender(updatedEmployee.getGender());
            }
            if(!selectedEmployee.getLevel().equals(updatedEmployee.getLevel())){
                selectedEmployee.setLevel(updatedEmployee.getLevel());
            }
            if(!selectedEmployee.getTeamInfo().equals(updatedEmployee.getTeamInfo())){
                selectedEmployee.setTeamInfo(updatedEmployee.getTeamInfo());
            }
            if(!selectedEmployee.getPositionTitle().equals(updatedEmployee.getPositionTitle())){
                selectedEmployee.setPositionTitle(updatedEmployee.getPositionTitle());
            }
            if(!selectedEmployee.getPhoneNumber().equals(updatedEmployee.getPhoneNumber())){
                selectedEmployee.setPhoneNumber(updatedEmployee.getPhoneNumber());
            }
        }
    }
}
