package academy.core.session3.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Trivia {
	public static void main(String... args) {
		Trivia.start();
	}
	
	public static void start() {
		System.out.print("\n-----------------------------------------------\n");
		System.out.println("¿Cuántos meses tienen 28 días?");
		System.out.println("\ta) 2");
		System.out.println("\tb) cuatro");
		System.out.println("\tc) 12");
		System.out.println("\td) 1");
		System.out.println("\tf) cinco\n");
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			
			if(input.matches("[a-f]")) {
				if(input.equals("c")) {
					System.out.println("Respuesta correcta!!!");
				}else {
					System.out.print("Respuesta incorrecta");
					for(int i=0;i<3;) {
						TimeUnit.MILLISECONDS.sleep(500);
						System.out.print('.');
						i++;
					}
					Trivia.start();
				}
			}else {
				System.out.print("Respuesta invalida");
				for(int i=0;i<3;) {
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.print('.');
					i++;
				}

				Trivia.start();
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
