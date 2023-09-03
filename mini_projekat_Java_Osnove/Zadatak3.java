package mini_projekat_Java_Osnove;

import java.util.ArrayList;

public class Zadatak3 {
    //    **Zadatak: Zamena Placeholdera u SQL Upitu**
//    Napišite program koji obavlja zamenu placeholdera u SQL upitu.Za rešenje ovog zadatka, biće potrebno upoznati se sa
//        upotrebom `replace` metode koju pruža `String` klasa u Javi.
//    Program će sačuvati sledeće informacije:
//            1. SQL upit (string) nad kojim će se obaviti zamena.
//            2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//    Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti. Placeholderi su
//    označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
//    VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//    i niz vrednosti je:
//    Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//    Nakon izvršenja zamene, dobiće se SQL upit:
//    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
//    VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');

    public static void main(String[] args) {

        String sqlUpit = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) " +
                "VALUES ('%0', '%1', '%2', '%3', '%4', '%5')";

        ArrayList<String> vrednosti = new ArrayList<>();
            vrednosti.add("Cardinal");
            vrednosti.add("Tom B. Erichsen");
            vrednosti.add("Skagen 21");
            vrednosti.add("Stavanger");
            vrednosti.add("4006");
            vrednosti.add("Norway");

            for (int i = 0; i < vrednosti.size(); i++) {
                sqlUpit = sqlUpit.replace("%" + i, vrednosti.get(i));
            }


        System.out.println(sqlUpit);
    }
}
