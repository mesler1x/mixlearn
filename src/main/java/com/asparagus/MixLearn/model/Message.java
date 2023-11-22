package com.asparagus.MixLearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long id;
    private Long memberFrom;
    private Long memberTo;
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberFrom() {
        return memberFrom;
    }

    public void setMemberFrom(Long memberFrom) {
        this.memberFrom = memberFrom;
    }

    public Long getMemberTo() {
        return memberTo;
    }

    public void setMemberTo(Long memberTo) {
        this.memberTo = memberTo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
