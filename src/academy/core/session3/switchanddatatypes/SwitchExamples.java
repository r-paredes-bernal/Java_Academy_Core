package academy.core.session3.switchanddatatypes;

/* Develop code that uses String objects in the switch statement, binary literals, 
and numeric literals, including underscores in literals*/

public class SwitchExamples {
	public static void main(String[] args) {
		SwitchExamples.validateCardNumber();
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
		byte byte1 = 100;

		switch (byte1) {
		case 100:
			System.out.println("The 100");
			break;
		case 127:
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
		case 'a':
			System.out.println("The a");
			break;
		default:
			System.out.println("Who knows?");
			break;
		}
	}

	// 32-bit signed
	public static void switchInteger() {
		Integer int1 = 10;

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
		Character char1 = '\u0068'; // see character list in reference

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
		int intVar = 5234_891; // see character list in reference

		switch (intVar) {
			case 5234_891:
				System.out.println("The card # is: 5234_891");
				break;
			default:
				System.out.println("The default");
				break;
		}
	}

}
