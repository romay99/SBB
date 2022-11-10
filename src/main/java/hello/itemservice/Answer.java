package hello.itemservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;


@Getter @Setter @Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalTime createDate;

    @ManyToOne
    private Question question;


}
