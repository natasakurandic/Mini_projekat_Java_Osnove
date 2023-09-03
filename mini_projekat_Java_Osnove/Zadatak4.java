package mini_projekat_Java_Osnove;

import java.util.Scanner;

public class Zadatak4 {
    //**Zadatak: Zamena Vrednosti u Locust Komandi**
//
//        Za rešenje ovog zadatka, biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//                Napišite program koji omogućava korisniku da menja vrednosti unutar komande dok se ne zamene sve
//        vrednosti u komandi. Komanda iz primera je komanda koja pokreće Locust skriptu za stres testiranje. Ukoliko
//        ste zainteresovani, preporučuje se da istražite alat Locust.
//        Komanda je obican String, a vrednosti koje se menjaju su reči napisane velikim slovima i ispred svake od njih se
//        nalazi znak $. Ako u skripti postoji barem jedan znak $, to znači da još uvek postoje promenljive koje treba
//        zameniti. Program od korisnika traži da unese naziv promenljive za zamenu i vrednost koja će biti postavljena
//        umesto te promenljive u komandi. Nakon svake zamene, program će prikazati trenutnu komandu sa izmenama.
//        Komanda koja je koriscena za ovaj primer je
//        locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//        Promenljivi delovi komande su
//        $LOCUSTFILE
//        $NUMBER_OF_USERS
//        $SPAWN_RATE
//        $RUN_TIME
//        $HOST
//        $HTML_FILE

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    String komanda = "locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST " +
                "--html $HTML_FILE";
                    boolean uslov = true;
                while (uslov) {
                    System.out.println("Unesite naziv promenljive: ");
                        String promenljiva = s.next();
                    System.out.println("Unesite novu vrednost: ");
                        String vrednost = s.next();
                    System.out.print("Komanda: ");
                    System.out.println(komanda = komanda.replace(promenljiva, vrednost));
                        if (!komanda .contains("$")) {
                            uslov = false;

                        }
                }
    }
}
