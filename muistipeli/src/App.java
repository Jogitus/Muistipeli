import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int arvaus = 0;
        int[] Numero;
        double tarkistus = 100.0d;

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
    
        for(int i=0; i<Numero.length; i++){
            int randomNumber=random.nextInt(5) + 1;
        Numero[i] = Numero[i]  + randomNumber;
    }

        System.out.println();
        System.out.println(Numero[0] + " " + Numero[1] + " " + Numero[2] + " " + Numero[3] + " " + Numero[4] + " " + Numero[5] + " " + Numero[6]  + " (3 sekunnin jälkeen ruutu tyhjennetään)");
        System.out.println();


                try { 
                    Thread.sleep(3000);
                } 
                catch(InterruptedException ex) { 
                    Thread.currentThread().interrupt();
                 }
                for (int i = 0; i < 20; ++i) System.out.println();



        for(int i=0; i < Numero.length; i++){
            int j = i + 1;
        System.out.println("Syötä " + j + ". numero:");
        arvaus = Integer.parseInt(in.nextLine());
        lista.add(arvaus);
        }
            System.out.println();
            System.out.println("Oikeat numerot: " + Numero[0] + " " + Numero[1] + " " + Numero[2] + " " + Numero[3] + " " + Numero[4] + " " + Numero[5] + " " + Numero[6]);
            System.out.println("Sinun  numerot: " + lista.get(0) + " " + lista.get(1) + " " + lista.get(2) + " " + lista.get(3) + " " + lista.get(4) + " " + lista.get(5) + " " + lista.get(6));
            System.out.println();

        for(int i = 0; i < Numero.length; i++){
            if (Numero[i] == lista.get(i)){
            tarkistus = tarkistus;
            }else{
                tarkistus = tarkistus - 14.2857142857;
            }
        }
        System.out.println("Sait oikein " + tarkistus + "%");

        
        }
    }
