package com.asparagus.MixLearn.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Min(1)
    private Long memberFrom;

    @NotEmpty
    @Min(1)
    private Long memberTo;

    @NotNull(message = "Message must not be empty")
    private String text;
}
