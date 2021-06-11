package com.spring_boot.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class Phone {
    private int id;
    private String name;
    private int number;
    private boolean hasWife;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "person_id")
    private Person person;

    public Phone() {
    }

    public Phone(String name, int number, boolean hasWife) {
        this.name = name;
        this.number = number;
        this.hasWife = hasWife;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isHasWife() {
        return hasWife;
    }

    public void setHasWife(boolean hasWife) {
        this.hasWife = hasWife;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", hasWife=" + hasWife +
                '}';
    }
}
