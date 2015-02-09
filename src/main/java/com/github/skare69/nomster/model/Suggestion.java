package com.github.skare69.nomster.model;

import java.util.List;

/**
 * Model for the Nomster Suggestion.
 *
 * User: dominik.heimstaedt
 * Date: 05.02.2015
 * Time: 14:59
 */
public class Suggestion
{
    private String name;
    private String description;
    private byte[] image;
    private List<Attendee> attendees;
    private Float latitude;
    private Float longitude;

    public Float getLatitude()
    {
        return latitude;
    }

    public void setLatitude(Float latitude)
    {
        this.latitude = latitude;
    }

    public Float getLongitude()
    {
        return longitude;
    }

    public void setLongitude(Float longitude)
    {
        this.longitude = longitude;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public byte[] getImage()
    {
        return image;
    }

    public void setImage(byte[] image)
    {
        this.image = image;
    }

    public List<Attendee> getAttendees()
    {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees)
    {
        this.attendees = attendees;
    }
}
