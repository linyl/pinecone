package com.unisw.pinecone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 36)
    private String number;

    @Column(name = "VISIT_COUNT")
    private long visitCount;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    protected User()
    {
    }

    public User(String number)
    {
        this.number = number;
        this.visitCount = 0;
    }

    public long getVisitCount()
    {
        return visitCount;
    }

    public void setVisitCount(long visitCount)
    {
        this.visitCount = visitCount;
    }

    @Override
    public String toString()
    {
        return String.format("User[id=%d, number='%s', visitCount=%d]", id, number, visitCount);
    }
}
