/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.omg.javafxarticles.model;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author default
 */
public class Article {
    
    private final String id;
    private String title;
    private String content;
    private Date date;
    
    public Article() {
        this.id = UUID.randomUUID().toString();
    }
    
    public Article(String title, String content, Date date) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
        this.date = date;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
