package com.educational.todo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {

@Id
private Integer id;
@Column(name= "title")
private String title;
@Column(name= "descr")
private String descr;
@Column(name= "isdone" )
private Boolean isdone;

public Task(){

}

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescr() {
        return descr;
    }

    public Boolean getIsdone() {
        return isdone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setIsdone(Boolean isdone) {
        this.isdone = isdone;
    }
}

