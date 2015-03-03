package com.github.skare69.nomster.ui;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * The home page to use for Wicket.
 * <p/>
 * User: Dominik
 * Date: 03.03.2015
 * Time: 17:14
 */
public class HomePage
        extends WebPage
{
    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        super(parameters);

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        // TODO Add your page's components here

    }
}
