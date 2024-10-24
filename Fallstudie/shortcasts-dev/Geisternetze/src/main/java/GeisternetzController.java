import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named 
@ViewScoped

public class GeisternetzController implements Serializable
{
	
	private int index=0;
	
	@Inject
	private GhostNetFishing ghostNetFishing;

	public Geisternetz getGeisternetz() {
		return ghostNetFishing.getToDo().get(index);
	}
	
	//Hier möchte ich eine Methode schreiben, mit der sich der Status ändert, sobald das Netz zur Bergung gemeldet wird
	
}
