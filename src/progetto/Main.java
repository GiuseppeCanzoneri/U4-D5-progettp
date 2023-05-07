package progetto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[] oggettiMultimediali = new Object[5];

        for (int i = 0; i < oggettiMultimediali.length; i++) {
            System.out.println("Titolo dell'oggetto  n." + (i + 1) + " che vuoi generare:");
            String titolo = scanner.nextLine();

            System.out.println(titolo + " Vuoi creare un audio (a) , un video (v), o un immagine (i)?");
            String tipo = scanner.nextLine();

            switch (tipo) {
                case "a":
                    System.out.println("Volume dell'audio (numero intero):");
                    int volume = scanner.nextInt();

                    System.out.println("Durata dell'audio (numero intero):");
                    int durata = scanner.nextInt();

                    oggettiMultimediali[i] = new Audio(titolo, volume, durata);
                    break;

                case "v":
                    System.out.println("Volume del video ( numero intero):");
                    volume = scanner.nextInt();

                    System.out.println(" Durata del video (numero intero):");
                    durata = scanner.nextInt();

                    System.out.println(" Luminosità del video ( numero intero):");
                    int luminosita = scanner.nextInt();

                    oggettiMultimediali[i] = new Video(titolo, volume, durata, luminosita);
                    break;

                case "i":
                    System.out.println(" Luminosità dell'immagine (numero intero):");
                    luminosita = scanner.nextInt();
                    oggettiMultimediali[i] = new Immagine(titolo, luminosita);
                    break;

                default:
                    System.out.println("Non valido");
                    i--;
                    continue;
            }
            scanner.nextLine();
        }
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Che oggetto  vuoi riprodurre? (1-2-3-4-5?, digita 0 per uscire)");
            scelta = scanner.nextInt();
            
            if (scelta >= 1 && scelta <= 5) {
                Object oggetto = oggettiMultimediali[scelta - 1];

                if (oggetto instanceof Audio) {
                    ((Audio) oggetto).play();
                } else if (oggetto instanceof Video) {
                    ((Video) oggetto).play();
                } else if (oggetto instanceof Immagine) {
                    ((Immagine) oggetto).show();
                }
            } else if (scelta == 0) {
            	System.out.println("riproduzione interrotta");
            } else {
            	System.out.println("Scelta non valida riprova!");
            }
        }
        scanner.close();
    }
}