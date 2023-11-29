package com.asparagus.MixLearn.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Name must not be empty")
    @Size(min=2, max=100, message ="Name length must be between 2 and 100 characters")
    private String name;

    @NotEmpty(message = "Username must not be empty")
    @Size(min=2, max=100, message ="Username length must be between 2 and 100 characters")
    private String username;

    @NotEmpty(message = "Password must not be empty")
    private String password;

    @Pattern(regexp = "^(?:Student|Teacher)$", message = "You can be student or teacher")
    private String category;

    private String avatar;
}
