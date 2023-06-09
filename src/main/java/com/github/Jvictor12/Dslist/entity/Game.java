package com.github.Jvictor12.Dslist.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity (name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Float score;

    private String imgUrl;

    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

}
