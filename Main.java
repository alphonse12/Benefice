import java.util.Scanner;


class Main {
	public static void main (String [] args){
		
		System.out.println("                               Benefice 92 ---V0.01--- 11/12/91");
		System.out.println(" ");
		System.out.println("                               _______________________________ ");
		
		System.out.println("        Bienvenue dans notre programme de comptabilite.");
		System.out.println("        Nous vous aidons pour le moment à vous résumer ");
		System.out.println("        rapidement les premiers élément comptable.");
		System.out.println("        ");
		System.out.println("        Cordialement,");
		System.out.println("        MGM.");
		System.out.println("        ");
		System.out.println("        ");
		
		System.out.print("        Veuillez entrer le montant des ventes : ");
		Scanner Sc = new Scanner (System.in);
		Float a = Sc.nextFloat();
		Float b = (float) (a-a/2.22222) ; 
		
		System.out.println("        Votre Benefice : "+ b +" €");
		
	}

}
