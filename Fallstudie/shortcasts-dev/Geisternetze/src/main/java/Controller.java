import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("controller") 
@ViewScoped

public class Controller implements Serializable
{


	
	public String startBergen()
	{
		 return "bergen";
	}
	
	public String startMelden()
	{
		 return "melden";
	}

	public String stopEdit()
	{
		 return "index.xhtml";
	}
}
