package exo_7boucles;

public class Boucles {
    public static void main(String[] args){
        for(int i = 1; i<14; i++){
            System.out.println(i);
        }
        for(int i = 0; i<3; i++){
            System.out.println("Salut !");
        }

        int j = 0;
        while(j<3){
            System.out.println("Salut !");
            j++;
        }
        int k = 1;
        while(k<14){
            System.out.println(k);
            k++;
        }

        for(int l = 20; l>9; l--){
            System.err.println(l);
        }

        for(int m = 15; m<28; ++m){
            if (m%2==0){
            continue;
            } else {
                System.out.println(m);
            }
        }
       
    }

}

