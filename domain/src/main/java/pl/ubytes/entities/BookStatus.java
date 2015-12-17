package pl.ubytes.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created: Bajek
 * Date: 107.12.2015.
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
    private String ip;
    private String comments;
    private Timestamp buyDate;
    private String email;


    public BookStatus() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Timestamp buyDate) {
        this.buyDate = buyDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
