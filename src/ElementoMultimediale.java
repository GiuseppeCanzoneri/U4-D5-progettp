
public abstract class ElementoMultimediale {

	    protected String titolo;
	    protected int durata;

	    public ElementoMultimediale(String titolo, int durata) {
	        this.titolo = titolo;
	        this.durata = durata;
	    }

	    public abstract void esegui();

	    public int getDurata() {
	        return durata;
	    }

	    public String getTitolo() {
	        return titolo;
	    }
	}

