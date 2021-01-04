package com.vega.springit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    //user

    //link

    public Vote() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", vote=" + vote +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote1 = (Vote) o;
        return vote == vote1.vote && Objects.equals(id, vote1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vote);
    }
}
