package retangulo;

public class Area {

	public static void main(String[] args) {
		
		float area; 
		float perimetro;
		float altura = 20;
		float base = 10;
		 
		area = altura * base;
		perimetro = (altura + base) + (altura + base);
		
		System.out.print("Area do retangulo:");
		System.out.println(area);
		System.out.print("Perimetro do retangulo:");
		System.out.println(perimetro);
		

	}

}
