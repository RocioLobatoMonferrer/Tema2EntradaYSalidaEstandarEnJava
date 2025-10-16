package ejercicios2_1Printf;

public class Ejercicio1 {
	public void execirse1() {
		
		int x = 10;
		int y = -10;
		float n = 13.269834f;
		String cad = "Ana";
		
		System.out.printf("%d \n %+d \n %+d \n %.2f \n %+10.4f \n %10.5f \n %+09.3f \n n=%-7.2f x=%d \n %10s%s %4s", x, x,y,n,n,n,n,n,x,cad,cad, cad);
		
		
	}
	public static void main(String[] args) {
		new Ejercicio1().execirse1();
	}

}
