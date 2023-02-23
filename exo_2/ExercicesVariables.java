package exo_2;
public class ExercicesVariables {
    public static void main(String[] args) {
		//Pour chaque variable, afficher sa valeur avec System.out.println();
		// Définition et assignation d'un double (nombre à virgule)
        double monDouble = 2.2;
        System.out.println(monDouble);
		//Post incrémentation de d
        int d = 2;
        // l'incrémentation ne fonctionne pas si d = d++ mais d=++d ok
        d++;
        System.out.println(d);
		// Création d'une variable contenant un booléen, initialisé à true.
		boolean monBooleen = true;
        System.out.println(monBooleen);
		//Affichage du contraire de sa valeur.
        System.out.println(!monBooleen);
		// Création en une ligne de trois variables de type int, avec la valeur 4
        int premier, deuxieme, troisieme = deuxieme = premier = 2;
		// Affichage de la somme de ces trois variables
        System.out.println(premier+deuxieme+troisieme);
		//Création de trois variables (var1,var2,var3) valant 3, 4 et 5
		int var1 = 3;
        int var2 = 4;
        int var3 = 5;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
		//Afficher le résultat (booléen) de la comparaison suivante :  var1 < var2 et var2 < var3
        boolean nouvelleVar = var1<var2 && var2<var3;
        System.out.println(nouvelleVar);
		//Afficher le résultat (booléen) de la comparaison suivante :  var1 différent de var2 et var2 différent de var3
		boolean nouvelleVar2 = var1 != var2 && var2 != var3;
        System.out.println(nouvelleVar2);
		//Un petit opérateur ternaire pour finir ? Si la première variable définie
		// dans ce fichier est inférieure ou égale à la dernière
		// (de type entier) , afficher "ok" sinon afficher "ko"
        String result = monDouble<=var3 ? "ok" : "ko";
        System.out.println(result);

        //en une ligne, si f1 est plus grand que (f2+1), 
        //incrémenter f1 de 1 et afficher f1 = préincrémentation
        //sinon afficher f2 puis incrémenter f2 de 1 = post-incrémentation.
        float f1 = 3.14f;
        float f2 = 3.0f;
        System.out.println(f1<(f2+1) ? ++f1 : f2++);

        byte by = 127;
        by++;
        System.out.println(by);
        //-128 car limité à 127 si on dépasse la borne + on arrive à la borne -
        //idem si on dépasse la borne -, on arrive à la borne +
        //ici, la borne + est justement 127. 


    }
}
