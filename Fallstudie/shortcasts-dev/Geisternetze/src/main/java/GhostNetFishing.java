import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped

public class GhostNetFishing
{
	private List<Geisternetz> toDo = new ArrayList<Geisternetz>();

    /**
	 * Creates a new instance of GhostNetFishing
	 */
    public GhostNetFishing()
    {
		/**
		 * Hier werden die aktuellen Geisternetze eingefügt
		 */

    	toDo.add(new Geisternetz(25,35,20));
    	toDo.add(new Geisternetz(20,58,25));
    	
    }

	public List<Geisternetz> getToDo()
    {
		return toDo;
    }

	public void setToDo(List<Geisternetz> toDo) {
		this.toDo = toDo;
	}
	
	
	
}
