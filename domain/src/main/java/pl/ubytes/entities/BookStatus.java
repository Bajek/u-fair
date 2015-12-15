package pl.ubytes.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Bartłomiej on 07.12.2015.
 */
@Entity
@Table(name = "Status")
public class BookStatus implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SuppressWarnings("PMD")
    private long status_id;

    @OneToOne
    @JoinColumn(name = "book_id", nullable = false, unique = true)
    Book book;

    private String buyer;


    public BookStatus() {
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
