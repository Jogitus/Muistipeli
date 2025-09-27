import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] Numero;
            Numero = new int [7];
                Numero[0] = 0;
                Numero[1] = 0;
                Numero[2] = 0;
                Numero[3] = 0;
                Numero[4] = 0;
                Numero[5] = 0;
                Numero[6] = 0;
        Random random = new Random();

        System.out.println("Yritä muistaa alla olevat numerot. Näet numerot 3 sekunnin ajan.");
    
        for(int i=0; i<Numero.length; i++){
            int randomNumber=random.nextInt(5) + 1;
        Numero[i] = Numero[i]  + randomNumber;
    }

            System.out.println(Numero[0] + " " + Numero[1] + " " + Numero[2] + " " + Numero[3] + " " + Numero[4] + " " + Numero[5] + " " + Numero[6]  + "(3 sekunnin jälkeen ruutu tyhjennetään)");
}
}