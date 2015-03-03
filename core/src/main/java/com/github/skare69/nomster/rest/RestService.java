package com.github.skare69.nomster.rest;

import com.github.skare69.nomster.entity.Suggestion;
import com.github.skare69.nomster.entity.Attendee;
import com.github.skare69.nomster.service.SuggestionService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.LinkedList;
import java.util.List;

/**
 * REST service for Nomster.
 * <p/>
 * User: dominik.heimstaedt
 * Date: 05.02.2015
 * Time: 14:43
 */
@Path("/")
public class RestService
{
    @Inject
    SuggestionService suggestionService;

    @GET
    @Path("test")
    @Produces({"application/json"})
    public Suggestion test()
    {
        List<Attendee> attendees = new LinkedList<>();
        Attendee personA = new Attendee();
        personA.setName("Person A");
        attendees.add(personA);
        Attendee personB = new Attendee();
        personB.setName("Person B");
        attendees.add(personB);
        Suggestion suggestion = new Suggestion();
        suggestion.setName("Moa meat!");
        suggestion.setDescription("Wanna eat some sandwiches?");
        suggestion.setLatitude(40.722196f);
        suggestion.setLongitude(-73.987429f);
        return suggestion;
    }

    @GET
    @Path("suggestion")
    @Produces({"application/json"})
    public List<Suggestion> loadCurrentSuggestions()
    {
        return suggestionService.getCurrentSuggestions();
    }
}
