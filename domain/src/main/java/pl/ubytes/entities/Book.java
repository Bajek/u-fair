package pl.ubytes.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Bajek on 05.12.2015.
 */
@Entity
@Table(name = "Books")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Integer bought;

    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getBought() {
        return bought;
    }

    public void setBought(Integer bought) {
        this.bought = bought;
    }
}
