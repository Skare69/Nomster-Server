package com.github.skare69.nomster.service;

import com.github.skare69.nomster.base.TransactionDao;
import com.github.skare69.nomster.entity.Suggestion;

import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.Collection;
import java.util.List;

/**
 * Service to access Suggestion entities.
 * <p/>
 * User: Dominik
 * Date: 12.02.2015
 * Time: 13:07
 */
@Stateless
@Named
public class SuggestionService
        extends TransactionDao
{
    public List<Suggestion> getCurrentSuggestions()
    {
        return getEntityManager().createNamedQuery("Suggestion.loadCurrentSuggestions", Suggestion.class)
                .getResultList();
    }
}
