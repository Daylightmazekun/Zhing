package com.nukezam.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class UserPlaned extends User {
    private Date date;
    private Date fromTime;
    private Date toTime;
    private User inviteUser;
    private String type;
    private String whatToDo;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public User getInviteUser() {
        return inviteUser;
    }

    public void setInviteUser(User inviteUser) {
        this.inviteUser = inviteUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWhatToDo() {
        return whatToDo;
    }

    public void setWhatToDo(String whatToDo) {
        this.whatToDo = whatToDo;
    }
}
