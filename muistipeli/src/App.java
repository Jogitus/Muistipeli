import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>(); // listaan lisätään käyttäjän syöttämät arvaukset
        int arvaus = 0; // Userin antamat arvo
        int[] Numero; // arvotut numerot
        double tarkistus = 100.0d; // Kuinka paljon käyttäjä sai oikein

        // arvottavat numerot
                Numero = new int [7];
                Numero[0] = 0;
                Numero[1] = 0;
                Numero[2] = 0;
                Numero[3] = 0;
                Numero[4] = 0;
                Numero[5] = 0;
                Numero[6] = 0;
        Random random = new Random();

        System.out.println();
        System.out.println("Yritä muistaa alla olevat numerot. Näet numerot 3 sekunnin ajan.");
        // Arpoo numerot
        for(int i=0; i<Numero.length; i++){
            int randomNumber=random.nextInt(5) + 1;
        Numero[i] = Numero[i]  + randomNumber;
    }
        // Tulostaa arvotut numerot
        System.out.println();
        System.out.println(Numero[0] + " " + Numero[1] + " " + Numero[2] + " " + Numero[3] + " " + Numero[4] + " " + Numero[5] + " " + Numero[6]  + " (3 sekunnin jälkeen ruutu tyhjennetään)");
        System.out.println();

        // odottaa 3 sekunttia
                try { 
                    Thread.sleep(3000);
                } 
                catch(InterruptedException ex) { 
                    Thread.currentThread().interrupt();
                 }
                // "tyhjentää" terminalin
                for (int i = 0; i < 20; ++i) System.out.println();


        // Kysyy käyttäjää syöttämään arvauksensa.
        for(int i=0; i < Numero.length; i++){
            int j = i + 1;
        System.out.println("Syötä " + j + ". numero:");
        arvaus = Integer.parseInt(in.nextLine());
        lista.add(arvaus); // Lisää arvauksen ArrayListaan "lista"
        }
            // Tulostaa oikeat ja käyttäjän antamat numerot.
            System.out.println();
            System.out.println("Oikeat numerot: " + Numero[0] + " " + Numero[1] + " " + Numero[2] + " " + Numero[3] + " " + Numero[4] + " " + Numero[5] + " " + Numero[6]);
            System.out.println("Sinun  numerot: " + lista.get(0) + " " + lista.get(1) + " " + lista.get(2) + " " + lista.get(3) + " " + lista.get(4) + " " + lista.get(5) + " " + lista.get(6));
            System.out.println();

        // Tarkistaa onko arvaus ja oikea numero samat, jos on ei tee mitään, jos ei ole 100% vähennetään 14,28....
        for(int i = 0; i < Numero.length; i++){
            if (Numero[i] == lista.get(i)){
            tarkistus = tarkistus;
            }else{
                tarkistus = tarkistus - 14.2857142857;
            }
        }
        // Tulostaa kuinka monta % käyttäjä sai oikein.
        System.out.println("Sait oikein " + tarkistus + "%");

        
        }
    }
