package com.sportradar_task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stages")
public class Stage {
    @Id
    private String id;

    private String name;
    private Integer ordering;

    public Stage() {
    }

    public Stage(String id, String name, Integer ordering) {
        this.id = id;
        this.name = name;
        this.ordering = ordering;
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

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ordering=" + ordering +
                '}';
    }
}
