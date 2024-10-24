import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped

public class Geisternetz
{


    private int laengengrad;
    private int breitengrad;

    private int groesse;
    
    private String status = "gemeldet";

    public Geisternetz(int laengengrad, int breitengrad, int groesse) {
		this.laengengrad = laengengrad;
		this.breitengrad = breitengrad;
		this.groesse = groesse;
	}

	public int getLaengengrad() {
		return laengengrad;
	}

	public void setLaengengrad(int laengengrad) {
		this.laengengrad = laengengrad;
	}

	public int getBreitengrad() {
		return breitengrad;
	}

	public void setBreitengrad(int breitengrad) {
		this.breitengrad = breitengrad;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
