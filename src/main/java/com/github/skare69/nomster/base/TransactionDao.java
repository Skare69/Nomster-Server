package com.github.skare69.nomster.base;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * This DAO should be used by all actions requiring the nomster persistence context and a transaction (i.e. no open transaction across
 * requests).
 * <p/>
 * User: Dominik
 * Date: 12.02.2015
 * Time: 11:46
 */
public abstract class TransactionDao
{
    protected Session getSession()
    {
        return (Session)getEntityManager().getDelegate();
    }

    @PersistenceContext(unitName = "nomster", type = PersistenceContextType.TRANSACTION)
    EntityManager entityManager;

    public EntityManager getEntityManager()
    {
        return entityManager;
    }
}
