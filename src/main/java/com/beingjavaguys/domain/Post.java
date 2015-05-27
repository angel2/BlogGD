package com.beingjavaguys.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Post {

	@Id
	@GeneratedValue
	private int id;
    @Column(name="date",insertable=false)
    private Date date;
    private String contetPost;
    private String frontImg;
    private int Users_id;
    private int Topics_id;
    @Column(name="status", insertable=false)
    private String status;
    private String title;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContetPost() {
        return contetPost;
    }

    public void setContetPost(String urlPost) {
        this.contetPost = urlPost;
    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
