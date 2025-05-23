import java.util.Scanner;

public class ExerciciosArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
			int[] vetorA = {6,6,6,6,9};
			int[] vetorB = {5,4,3,2,1};
			int[] vetorC = new int[5];
			
			for (int i = 0; i < vetorA.length; i ++) {
				vetorC[i] = (vetorA[i] + vetorB[i]);
			};
			
			System.out.print("Vetor A: ");
			for (int registro:vetorA) {
				System.out.printf(" " + registro);
			}
			
			System.out.print("\nVetor B: ");
			for (int registro:vetorB) {
				System.out.printf(" " + registro);
			}
			
			System.out.print("\nVetor C: ");
			for (int registro:vetorC) {
				System.out.printf(" " + registro);
			}
			
//---------------------------------------------------------------------//
			System.out.println("");
			System.out.println("\n**Valores impares**");
			
			System.out.print("Vetor A: ");
			for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i]%2 != 0) {
					System.out.print(" " + vetorA[i]);
				}
			}
			
			System.out.print("\nVetor B: ");
			for (int i = 0; i < vetorB.length; i++) {
				if (vetorB[i]%2 != 0) {
					System.out.print(" " + vetorB[i]);
				}
			}
			
			System.out.print("\nVetor C: ");
			for (int i = 0; i < vetorC.length; i++) {
				if (vetorC[i]%2 != 0) {
					System.out.print(" " + vetorC[i]);
				}
			}
			
//---------------------------------------------------------------------//
			System.out.println("");
			System.out.println("\n**Maior Número**");
			
			int maiorA = 0, maiorB = 0, maiorC = 0;
			System.out.print("Vetor A: ");
			for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i] > maiorA) {
					maiorA = vetorA[i];
				}
			}
			System.out.print(maiorA);
			
			System.out.print("\nVetor B: ");
			for (int i = 0; i < vetorB.length; i++) {
				if (vetorB[i] > maiorB) {
					maiorB = vetorB[i];
				}
			}
			System.out.print(maiorB);
			
			System.out.print("\nVetor C: ");
			for (int i = 0; i < vetorC.length; i++) {
				if (vetorC[i] > maiorC) {
					maiorC = vetorC[i];
				}
			}
			System.out.print(maiorC);
		scan.close();


    }
}