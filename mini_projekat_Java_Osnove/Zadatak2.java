package mini_projekat_Java_Osnove;

import java.util.ArrayList;

public class Zadatak2 {
//    **Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//    Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako da prvo
//    budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//    Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//    Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće čuvane
//    u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false).. Naravno,
//    korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika na poziciji N u
//    nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".


    public static void main(String[] args) {


        ArrayList<String> korisnici = new ArrayList<>();
        korisnici.add("Pera Peric");
        korisnici.add("Darko Darkovic");
        korisnici.add("Marko Markovic ");
        korisnici.add("Stefan Stefanovic");
        korisnici.add("Uros Urosevic");
        korisnici.add("Milan Milanovic");

        ArrayList<Boolean> aktivnost = new ArrayList<>();
        aktivnost.add(true);
        aktivnost.add(false);
        aktivnost.add(true);
        aktivnost.add(true);
        aktivnost.add(false);
        aktivnost.add(true);
        ArrayList<String> rezultati = new ArrayList<>();

        for (int i = 0; i < korisnici.size(); i++) {
            if (aktivnost.get(i) == true) {
                rezultati.add("| slika |" + "o " + korisnici.get(i));
            }
        }
        for (int i = 0; i < korisnici.size(); i++) {
            if (aktivnost.get(i) == false) {
                rezultati.add("| slika |" + "x " + korisnici.get(i));
            }
        }
        for (int i = 0; i < rezultati.size(); i++) {
            System.out.println(rezultati.get(i));
        }
    }
}

