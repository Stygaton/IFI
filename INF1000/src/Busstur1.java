import java.util.Scanner;

class Busstur1 {
	    public static void main(String[] args) {
	        Scanner tastatur = new Scanner(System.in);
	        int passasjerer = 0;
	        int nye = 0;

	        System.out.println("Stasjon 1! Hvor mange gaar paa bussen?");
	        nye = Integer.parseInt(tastatur.nextLine());

	        if((passasjerer + nye) >= 30) {
	            passasjerer = 30;
	            System.out.println("Bussen er full. " + (passasjerer + nye - 30) + " maa gaa til fots.");
	        } else {
	            passasjerer += nye;
	        }

	        System.out.println("Stasjon 2! Hvor mange gaar paa bussen?");
	        nye = Integer.parseInt(tastatur.nextLine());

	        if((passasjerer + nye) >= 30) {
	            passasjerer = 30;
	            System.out.println("Bussen er full. " + (passasjerer + nye - 30) + " maa gaa til fots.");
	        } else {
	            passasjerer += nye;
	        }

	        System.out.println("Stasjon 3! Hvor mange gaar paa bussen?");
	        nye = Integer.parseInt(tastatur.nextLine());

	        if((passasjerer + nye) >= 30) {
	            passasjerer = 30;
	            System.out.println("Bussen er full. " + (passasjerer + nye - 30) + " maa gaa til fots.");
	        } else {
	            passasjerer += nye;
	        }
	    }
	}