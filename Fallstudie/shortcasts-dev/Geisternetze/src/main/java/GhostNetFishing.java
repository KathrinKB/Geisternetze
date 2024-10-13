import java.util.ArrayList;
import java.util.Collection;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class GhostNetFishing
{
	private Collection<Geisternetz> toDo = new ArrayList<Geisternetz>();

    /**
	 * Creates a new instance of GhostNetFishing
	 */
    public GhostNetFishing()
    {
		/**
		 * Hier werden die aktuellen Geisternetze eingefügt
		 */

    }

	public Collection<Geisternetz> getToDo()
    {
		return toDo;
    }
}
