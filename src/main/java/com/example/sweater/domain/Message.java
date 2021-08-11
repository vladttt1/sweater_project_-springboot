package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  id;
    private String text;

    private String tag;

    public Message() {
    }

    public Integer getId(){

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        if (text  == null) return "ERROR";
        else

        return this.text;

    }

    //text.getName() != null;
      // obj.getName.equals("");

    public void setText(String text) {
        this.text = text;
    }

    public String  getTag() {
        if (tag == null) return "ERROR";
        else
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Message(String text, String tag) {
    }
}
