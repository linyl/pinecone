package com.unisw.pinecone.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_VISIT_LOG")
public class VisitLog
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "USER_ID", updatable = false)
    private User user;

    @Column(name = "VISIT_TIME")
    private Date visitTime;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Date getVisitTime()
    {
        return visitTime;
    }

    public void setVisitTime(Date visitTime)
    {
        this.visitTime = visitTime;
    }

    @Override
    public String toString()
    {
        return String.format("VisitLog[id=%d, user='%s', visitTime='%tY-%tm-%td %tH:%tM:%tS']", id, user.getNumber(),
                visitTime);
    }
}
