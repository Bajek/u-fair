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


    private String author;
    private String title;

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
}
