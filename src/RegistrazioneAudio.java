
public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

	@Override
	public void esegui() {
		// TODO Auto-generated method stub
		
	}
}