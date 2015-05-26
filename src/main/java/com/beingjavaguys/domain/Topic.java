package com.beingjavaguys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Topic {

	@Id
	@GeneratedValue
	private int id;
    private int date;
    private int urlPost;
    private int frontImg;
    private int Users_id;
    private int Topics_id;
    private int status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getUrlPost() {
        return urlPost;
    }

    public void setUrlPost(int urlPost) {
        this.urlPost = urlPost;
    }

    public int getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(int frontImg) {
        this.frontImg = frontImg;
    }

    public int getUsers_id() {
        return Users_id;
    }

    public void setUsers_id(int users_id) {
        Users_id = users_id;
    }

    public int getTopics_id() {
        return Topics_id;
    }

    public void setTopics_id(int topics_id) {
        Topics_id = topics_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
