package nl.laurs.view;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.link.Link;

import nl.laurs.view.overview.ReleaseOverviewPage;

/**
 * @author: ML
 */
public class DataViewMenuPage extends BasePage {

    public DataViewMenuPage(final Page backPage) {
        super(backPage);
        add(addArtistLink());
    }

    private Link<Void> addArtistLink() {
        return new Link<Void>("releaseOverview") {
            @Override
            public void onClick() {
                setResponsePage(new ReleaseOverviewPage());
            }
        };
    }

    @Override
    protected String getPageTitle() {
        return "Gegevens bekijken";
    }
}
