package com.github.skare69.nomster.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Model for the Nomster entity nomster.attendee_suggestion_subscription.
 * <p/>
 * User: Dominik
 * Date: 12.02.2015
 * Time: 15:47
 */
@Entity
@Table(name = "attendee_suggestion_subscription", schema = "nomster", catalog = "")
public class AttendeeSuggestionSubscription
{
    private int idAttendeeSuggestionSubscription;
    private int idSuggestion;
    private int idAttendee;
    private Attendee attendee;
    private Suggestion suggestion;

    @Id
    @Column(name = "id_attendee_suggestion_subscription", nullable = false, insertable = true, updatable = true)
    public int getIdAttendeeSuggestionSubscription()
    {
        return idAttendeeSuggestionSubscription;
    }

    public void setIdAttendeeSuggestionSubscription(int idAttendeeSuggestionSubscription)
    {
        this.idAttendeeSuggestionSubscription = idAttendeeSuggestionSubscription;
    }

    @Basic
    @Column(name = "id_suggestion", nullable = false, insertable = true, updatable = true, length = 90)
    public int getIdSuggestion()
    {
        return idSuggestion;
    }

    public void setIdSuggestion(int idSuggestion)
    {
        this.idSuggestion = idSuggestion;
    }

    @Basic
    @Column(name = "id_attendee", nullable = false, insertable = true, updatable = true, length = 90)
    public int getIdAttendee()
    {
        return idAttendee;
    }

    public void setIdAttendee(int idAttendee)
    {
        this.idAttendee = idAttendee;
    }

    @ManyToOne
    public Attendee getAttendee()
    {
        return attendee;
    }

    public void setAttendee(Attendee attendee)
    {
        this.attendee = attendee;
    }

    @ManyToOne
    public Suggestion getSuggestion()
    {
        return suggestion;
    }

    public void setSuggestion(Suggestion suggestion)
    {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || !(o instanceof AttendeeSuggestionSubscription)) return false;

        AttendeeSuggestionSubscription that = (AttendeeSuggestionSubscription)o;
        if (idAttendee != that.getIdAttendee()) return false;
        if (idSuggestion != that.getIdSuggestion()) return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int result = suggestion.hashCode();
        result = 31 * result + attendee.hashCode();
        return result;
    }
}
