package com.getarrays.employee_manager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String jobTitle;
    private String phone;
    private String email;
    private String address;
    private String imageURL;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

    public Employee(){}

    public Employee(String name,String email,String address,String phone,String jobTitle,String imageURL,String employeeCode){
        this.name=name;
        this.email=email;
        this.address=address;
        this.phone=phone;
        this.jobTitle=jobTitle;
        this.imageURL=imageURL;
        this.employeeCode=employeeCode;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getImageURL(){
        return imageURL;
    }
    public void setImageURL(String imageURL){
        this.imageURL=imageURL;
    }

    public String getEmployeeCode(){
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode){
        this.employeeCode=employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + '\'' +
                ", email=" + email + '\'' + ", address=" + address + '\'' + ", phone=" + phone + '\'' +
                ", jobTitle=" + jobTitle + '\'' +
                ", imageURL=" + imageURL + '\'' +
                '}';
    }
}
