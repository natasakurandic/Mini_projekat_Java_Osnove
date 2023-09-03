package mini_projekat_Java_Osnove;

import java.util.Scanner;

public class Zadatak1 {
//    **Zadatak: Simulacija skidanja tekstualnog fajla**
//    Napišite program koji simulira proces skidanja tekstualnog fajla. Skidanje fajla se obavlja u paketima od po
//        5 karaktera. Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
//    Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//    Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//    Korisnik će biti upitan za podatke svakog paketa kroz for petlju. Nakon unosa svakog paketa, program treba
//    da prikaže procenat trenutno skinutog fajla. Na programu je da odredi koliko paketa je potrebno za ceo fajl.
//    Na kraju programa, ispišite sadržaj celog fajla.
//    Primer izvršenja 1:
//    Unesite veličinu fajla: 25
//    Unesite paket: soiek
//    Skinuto 20.0%
//    Unesite paket: ew43t
//    Skinuto 40.0%
//    Unesite paket: tr5y7
//    Skinuto 60.0%
//    Unesite paket: dbtu6
//    Skinuto 80.0%
//    Unesite paket: 6ghku
//    Skinuto 100.0%
//    Sadržaj fajla je: soiekew43ttr5y7dbtu66ghku

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite velicinu fajla u bajtovima (1 karakter = 1 bajt)");
            int velicinaFajla = s.nextInt();
            int brojIteracija = 0;
            String fajl = "";
            double skinuto;

        if (velicinaFajla % 5 == 0) {
            brojIteracija = velicinaFajla / 5;
        } else {
            brojIteracija = velicinaFajla / 5 + 1;
        }

            for (int i = 0; i < brojIteracija; i++) {
                System.out.println("Unesite paket podataka za skidanje");
                    String podaci = s.next();
                    fajl = fajl + podaci;
                System.out.println();
                     skinuto =  ((double) fajl.length() / velicinaFajla) * 100;
                System.out.println(skinuto + " %");
            }
        System.out.println(fajl);
    }
}
