package com.asparagus.MixLearn.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Article {
    @NonNull
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String p1;

    @NotNull
    private String p2;

    @NotNull
    private String p3;

    @NotEmpty
    private String img1;

    @NotEmpty
    private String img2;

    @NotEmpty
    private String img3;

}
