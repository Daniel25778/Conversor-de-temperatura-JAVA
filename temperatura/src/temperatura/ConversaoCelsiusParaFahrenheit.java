package temperatura;

public class ConversaoCelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		float celsius = 60f;
		float fahrenheit;
		
		fahrenheit = (9 * celsius + 160) / 5;
		System.out.print("Temperatura Celsius em fahrenheit:" + fahrenheit + "°F");
		

	}

}
