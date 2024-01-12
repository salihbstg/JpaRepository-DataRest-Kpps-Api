package com.example.kpssdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "turkish")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Turkish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "question")
    private String question;
    @Column(name = "options1")
    private String options1;
    @Column(name = "options2")
    private String options2;
    @Column(name = "options3")
    private String options3;
    @Column(name = "options4")
    private String options4;
    @Column(name = "answer")
    private String answer;
}
