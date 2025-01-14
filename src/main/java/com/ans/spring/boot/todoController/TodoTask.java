package com.ans.spring.boot.todoController;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tasks")
public class TodoTask {

    @Id
    Integer id;
    String name;
    String summary;
    String desc;

    public TodoTask() {
    }

    public TodoTask(Integer id, String name, String summary, String desc) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
