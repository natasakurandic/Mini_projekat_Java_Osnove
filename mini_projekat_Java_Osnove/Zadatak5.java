package mini_projekat_Java_Osnove;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
//    Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//    Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link:
//    random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne
//    brojeve i kako ih možete koristiti u različitim situacijama.
//    Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda,
//    a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih
//    metoda za generisanje karaktera i passworda.
//            generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve
//            (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//            generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!`
//            (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//            Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//          Glavni program:
//            - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//            - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu passworda");
        int duzinaPassworda = s.nextInt();
        System.out.println("Da li zelite da vas password sadrzi specijalan karakter DA ili NE");
        String specijalniKarakter = s.next();

        String password = "";
        for (int i = 0; i < duzinaPassworda; i++) {

            if (specijalniKarakter.equals("DA") && i == duzinaPassworda - 1) {
                password = password + generisiRandomSpecijalniKarakter();
            } else {
                password = password + generisiRandomKarakter();
            }
        }
        System.out.println(password);
    }
    public static String generisiRandomKarakter() {
        Random rand = new Random();
        ArrayList<String> nizKaraktera = new ArrayList<>();
        nizKaraktera.add("A");
        nizKaraktera.add("B");
        nizKaraktera.add("C");
        nizKaraktera.add("D");
        nizKaraktera.add("E");
        nizKaraktera.add("F");
        nizKaraktera.add("G");
        nizKaraktera.add("H");
        nizKaraktera.add("I");
        nizKaraktera.add("J");
        nizKaraktera.add("K");
        nizKaraktera.add("L");
        nizKaraktera.add("M");
        nizKaraktera.add("N");
        nizKaraktera.add("O");
        nizKaraktera.add("P");
        nizKaraktera.add("Q");
        nizKaraktera.add("R");
        nizKaraktera.add("S");
        nizKaraktera.add("T");
        nizKaraktera.add("U");
        nizKaraktera.add("V");
        nizKaraktera.add("W");
        nizKaraktera.add("X");
        nizKaraktera.add("Y");
        nizKaraktera.add("Z");
        nizKaraktera.add("0");
        nizKaraktera.add("1");
        nizKaraktera.add("2");
        nizKaraktera.add("3");
        nizKaraktera.add("4");
        nizKaraktera.add("5");
        nizKaraktera.add("6");
        nizKaraktera.add("7");
        nizKaraktera.add("8");
        nizKaraktera.add("9");

        int granica = nizKaraktera.size();
        int randomBroj = rand.nextInt(granica);
        String randomString = nizKaraktera.get(randomBroj);
        return randomString;

    }

    public static String generisiRandomSpecijalniKarakter() {
        Random rand = new Random();
        ArrayList<String> specijalniKrakteri = new ArrayList();
        specijalniKrakteri.add("@");
        specijalniKrakteri.add("#");
        specijalniKrakteri.add("&");
        specijalniKrakteri.add("*");
        specijalniKrakteri.add("!");
        specijalniKrakteri.add("^");

        int granica = specijalniKrakteri.size();
        int randomBroj = rand.nextInt(granica);
        String randomString = specijalniKrakteri.get(randomBroj);
        return randomString;
    }
}
