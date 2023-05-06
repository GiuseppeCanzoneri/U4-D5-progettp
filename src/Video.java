public class Video extends ElementoMultimediale implements Riproducibile {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

	@Override
	public void esegui() {
		// TODO Auto-generated method stub
		
	}
}
