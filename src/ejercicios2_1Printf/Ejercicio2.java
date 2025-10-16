package ejercicios2_1Printf;
import static ejercicios2_1Printf.Colors.*;
public class Ejercicio2 {
	public void execirse2() {
	
		System.out.printf("%s%s%s %s%s%s %s%s%s", RED, BLUE_BACKGROUND,"Uno",BLACK, PURPLE_BACKGROUND, "Dos", WHITE_BACKGROUND, CYAN, "Tres" );	
	}
	public static void main(String[] args) {
		new Ejercicio2().execirse2();
	}
}
