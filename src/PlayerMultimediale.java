import java.util.Scanner;

public class PlayerMultimediale {

    public static void main(String[] args) {
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci il tipo di elemento multimediale (1: Immagine, 2: Video, 3: Registrazione Audio): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere newline residuo

            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("Inserisci la luminosita': ");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;

                case 2:
                    System.out.print("Inserisci la durata: ");
                    int durataV = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere newline residuo
                    System.out.print("Inserisci la luminosita': ");
                    int luminositaV = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataV, luminositaV);
                    break;

                case 3:
                    System.out.print("Inserisci la durata: ");
                    int durataA = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere newline residuo
                    System.out.print("Inserisci il volume: ");
                    int volume = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataA, volume);
                    break;

                default:
                    System.out.println("Tipo non valido!");
                    i--;
                    break;
            }
        }

        int scelta = -1;

        while (scelta != 0) {
            System.out.println();
            System.out.println("Elenco elementi multimediali:");

            for (int i = 0; i < 5; i++) {
                System.out.printf("%d) %s\n", i + 1, elementi[i].getTitolo());
            }

            System.out.println("0) Esci");
            System.out.print("Scegli l'elemento da riprodurre: ");
            scelta = scanner.nextInt();

            if (scelta < 0 || scelta > 5) {
                System.out.println("Scelta non valida!");
            } else if (scelta != 0) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                System.out.printf("Esecuzione di \"%s\":\n", elemento.getTitolo());

                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                }
            }
        }

        scanner.close();
    }
}
