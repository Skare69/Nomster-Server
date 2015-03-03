package com.github.skare69.nomster.ui;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Base entry point for Wicket.
 * <p/>
 * User: Dominik
 * Date: 03.03.2015
 * Time: 17:13
 */
public class WicketApplication
        extends WebApplication
{
    @Override
    public Class<? extends Page> getHomePage()
    {
        return HomePage.class;
    }
}
