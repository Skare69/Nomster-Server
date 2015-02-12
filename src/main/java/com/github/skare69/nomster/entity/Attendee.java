package com.github.skare69.nomster.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model for Nomster {@link com.github.skare69.nomster.entity.Suggestion} attendees.
 * <p/>
 * User: dominik.heimstaedt
 * Date: 05.02.2015
 * Time: 15:02
 */
@Entity
@Table(name = "attendee", schema = "nomster", catalog = "")
public class Attendee
{
    private int idAttendee;
    private String name;

    @Id
    @Column(name = "id_attendee", nullable = false, insertable = true, updatable = true)
    public int getIdAttendee()
    {
        return idAttendee;
    }

    public void setIdAttendee(int idAttendee)
    {
        this.idAttendee = idAttendee;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 90)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attendee attendee = (Attendee)o;

        if (!name.equals(attendee.name)) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}
