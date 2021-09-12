package nl.rjdvdb.persistence;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column(nullable = false)
    private String title;

    @Column
    private LocalDateTime finished;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getFinished() {
        return finished;
    }

    public void setFinished(LocalDateTime finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return String.format("[%s: %s]", title, (finished == null ? "❌" : "✅"));
    }
}
