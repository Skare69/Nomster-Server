package com.github.skare69.nomster.service;

import com.github.skare69.nomster.base.TransactionDao;
import com.github.skare69.nomster.entity.Attendee;
import com.github.skare69.nomster.entity.Suggestion;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Service to setup some basic configuration for testing. Obsolete once we have a non volatile database.
 * <p/>
 * User: dominik.heimstaedt
 * Date: 13.02.2015
 * Time: 14:16
 */
@Singleton
@Startup
public class DefaultSetupService
    extends TransactionDao
{
    private static final Logger logger = Logger.getLogger(DefaultSetupService.class);

    @PostConstruct
    private void init()
    {
        Suggestion suggestion = new Suggestion();
        suggestion.setName("Döner");
        LocalDate date = LocalDate.now();
        if (date.getDayOfWeek() < DateTimeConstants.MONDAY && date.getDayOfWeek() > DateTimeConstants.FRIDAY)
        {
            date = date.plusDays(2);
        }
        Calendar newDate = Calendar.getInstance();
        newDate.setTime(date.toDateMidnight().toDate());
        suggestion.setDate(newDate);
        suggestion.setDescription("test");
        suggestion.setLatitude(40.722196f);
        suggestion.setLongitude(-73.987429f);
        try
        {
            suggestion.setImage(IOUtils.toByteArray(DefaultSetupService.class.getClassLoader().getResourceAsStream("defaultSetup/doener" +
                    ".jpg")));
        }
        catch (IOException e)
        {
           logger.error(e);
        }
        getEntityManager().persist(suggestion);
    }
}
