package academy.core.session3.switchanddatatypes;

import java.io.IOException;
import java.util.Scanner;

/* Develop code that uses String objects in the switch statement, binary literals, 
and numeric literals, including underscores in literals*/

public class SwitchExamples {
	public static void main(String[] args) throws IOException, InterruptedException {
		//SwitchExamples.validateCardNumber();

		Scanner in = new Scanner(System.in); 
		String respuesta = null;
		boolean band= true;

		do {

			System.out.println("Hola, Por favor elija al vengador que desea hacer polvo en EndGame");
			System.out.println("A)Iron Man ");
			System.out.println("B)Thor");
			System.out.println("C)Capitan America");
			System.out.println("D)Viuda Negra");
			System.out.println("E)Ojo de Halcon");
			System.out.println();
			System.out.print("Respuesta: ");
			respuesta= in.nextLine(); 
			System.out.println();
			switch (respuesta) {
			case "A":
				System.out.println("Iron Man a desaparecido");
				band=false;
				break;
			case "B":
				System.out.println("Thor a desaparecido");
				band=false;
				break;
			case "C":
				System.out.println("Capitan America a desaparecido");
				band=false;
				break;
			case "D":
				System.out.println("Viuda Negra a desaparecido");
				band=false;
				break;
			case "E":
				System.out.println("Ojo de Halcon a desaparecido");
				band=false;
				break;

			default:
				for (int i = 0; i < 50; ++i) System.out.println();
				System.out.println("Opción no valida");
				break;
			}

		}while(band);
		System.out.println();
		System.out.println("Fin del juego");
	}

	public static void switchStrings() {
		String text = new String("Hello!");
		switch (text) {
		case "Hello!":
			System.out.println("The text string is \"Hello\"");
			break;
		default:
			System.out.println("The text string is NOT \"Hello\"");
			break;
		}
		if (text.equals("Hello!")) {
			System.out.println("The text string is \"Hello\"");
		} else {
			System.out.println("The text string is NOT \"Hello\"");
		}
	}

	// 8 bit-signeds
	public static void switchByte() {
		byte byte1 = 101;

		switch (byte1) {
		case 100:
			System.out.println("The 100");
			break;
		case 5:
			System.out.println("The 200");
			break;
		}
	}

	// 16-bit signed
	public static void switchShort() {
		short short1 = 120;

		switch (short1) {
		case 100:
			System.out.println("The 100");
			break;
		case 'x':
			System.out.println("The a");
			break;
		default:
			System.out.println("Who knows?");
			break;
		}
	}

	// 32-bit signed
	public static void switchInteger() {
		Integer int1 = 1;

		switch (int1) {
		case 10:
			System.out.println("The 10");
			break;
		case 20:
			System.out.println("The 20");
			break;
		default:
			System.out.println("The default");
			break;
		}
	}

	public static void switchCharacter() {
		Character char1 = '\u0068'; // see character list in refernce

		// Character char1 = "hello".charAt(0);

		switch (char1) {
		case 'h':
			System.out.println("The h");
			break;
		case ' ':
			System.out.println("The space");
			break;
		default:
			System.out.println("The default");
			break;
		}
	}

	// see how to use _ See data type in reference
	public static void validateCardNumber() {
		int intVar = 5_234_891; // see character list in reference

		switch (intVar) {
		case 5_234_891:
			System.out.println("The card # is: 5234_891");
			break;
		default:
			System.out.println("The default");
			break;
		}

		intVar++;
		System.out.println("NUevo valor: " +  intVar);


	}

}
