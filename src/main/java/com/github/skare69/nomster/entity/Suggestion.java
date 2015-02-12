package com.github.skare69.nomster.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Timestamp;

/**
 * Model for the Nomster entity nomster.suggestion.
 * <p/>
 * User: dominik.heimstaedt
 * Date: 05.02.2015
 * Time: 14:59
 */
@Entity
@Table(name = "suggestion", schema = "nomster", catalog = "")
public class Suggestion
{
    private int idSuggestion;
    private String name;
    private String description;
    private Float latitude;
    private Float longitude;
    private byte[] image;
    private Timestamp date;

    @Id
    @Column(name = "id_suggestion", nullable = false, insertable = true, updatable = true)
    public int getIdSuggestion()
    {
        return idSuggestion;
    }

    public void setIdSuggestion(int idSuggestion)
    {
        this.idSuggestion = idSuggestion;
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

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 90)
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Basic
    @Column(name = "latitude", nullable = true, insertable = true, updatable = true)
    public Float getLatitude()
    {
        return latitude;
    }

    public void setLatitude(Float latitude)
    {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude", nullable = true, insertable = true, updatable = true)
    public Float getLongitude()
    {
        return longitude;
    }

    public void setLongitude(Float longitude)
    {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "image", nullable = true, insertable = true, updatable = true)
    public byte[] getImage()
    {
        return image;
    }

    public void setImage(byte[] image)
    {
        this.image = image;
    }

    @Basic
    @Column(name = "date", nullable = false, insertable = true, updatable = true)
    public Timestamp getDate()
    {
        return date;
    }

    public void setDate(Timestamp date)
    {
        this.date = date;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Suggestion that = (Suggestion)o;

        if (!date.equals(that.date)) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + date.hashCode();
        return result;
    }
}
