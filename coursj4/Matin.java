package coursj4;

public class Matin {
    //type primitif et wrapper
    public static void main(String[]args){
        for(int i = 5; i<10; i++){
            System.out.println(i);
        }

        // boucle while
        int j = 15;
        while(j < 20){
            System.out.println(j);
            j++;
        }

        //boucle do while
        int k = 0;
        do {
            System.out.println("Mon compteur est de : " + k);
            System.out.println("coucou");
            k++;
        } while(k<5);
    }
    
}
