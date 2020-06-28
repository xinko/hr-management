package com.github.hrmanagement.pojo;

import java.util.Date;

public class Department {
    private String id;

    private String name;

    private String type;

    private String telephone;

    private String fax;

    private String description;

    private String predepartment;

    private Date date;

    public Department() {
    }

    public Department(String id, String name, String type, String telephone, String fax, String description, String predepartment, Date date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.telephone = telephone;
        this.fax = fax;
        this.description = description;
        this.predepartment = predepartment;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPredepartment() {
        return predepartment;
    }

    public void setPredepartment(String predepartment) {
        this.predepartment = predepartment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", description='" + description + '\'' +
                ", predepartment='" + predepartment + '\'' +
                ", date=" + date +
                '}';
    }
}
