package com.asparagus.MixLearn.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
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
<<<<<<< Updated upstream

    @NotEmpty(message = "Name must not be empty")
    @Size(min=2, max=100, message ="Name length must be between 2 and 100 characters")
    private String name;

    @NotEmpty(message = "Username must not be empty")
    @Size(min=2, max=100, message ="Username length must be between 2 and 100 characters")
=======
    private String name;
>>>>>>> Stashed changes
    private String username;

    @NotEmpty(message = "Password must not be empty")
    private String password;

    @Pattern(regexp = "^(?:Student|Teacher)$", message = "You can be student or teacher")
    private String category;

    private String avatar;
<<<<<<< Updated upstream
=======

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
>>>>>>> Stashed changes
}
