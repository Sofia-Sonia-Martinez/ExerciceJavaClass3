import ejercicioClase4.CapitalLetter;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("hola");
        listString.add("como");
        listString.add("estas");
        CapitalLetter capitalLetter = (a)-> a
                //.stream()
                //.toList()
                .toString()
                .toUpperCase();

        String result = capitalLetter.stringToCapitalLetter(listString);
        System.out.println(result);


    }
}