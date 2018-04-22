import java.util.Scanner;

public class NumeriSottoLaMedia {

	public static void main(String[] args) {
		int numeroTemperature;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Quanti valori di temperatura vuoi inserire?");
		numeroTemperature= tastiera.nextInt();
		double[] arrayTemperature= new double[numeroTemperature];
		temperaturaMedia(arrayTemperature);
	}
	
	//metodo che calcola la temperatura media 
	public static void temperaturaMedia(double[] temperatura){
		double sommaTemperature=0;
		double temperaturaMedia;
		int contaGiorni=0;
		Scanner tastiera= new Scanner(System.in);
		for(int i=0;i<temperatura.length;i++){
			System.out.println("Inserisci un valore positivo della temperatura");
			temperatura[i]=tastiera.nextDouble();
			sommaTemperature=sommaTemperature+temperatura[i];
		}
		tastiera.close();
		temperaturaMedia=sommaTemperature/temperatura.length;
		System.out.println("La temperatura media vale:"+ temperaturaMedia);
		//giorni in cui la temperatura e' al di sotto della media
		for(int i=0;i<temperatura.length;i++){
			if(temperaturaMedia>temperatura[i])
				contaGiorni++;
		}
		System.out.println("Il numero di giorni in cui la temperatura e' al di sotto della media sono: "+contaGiorni);
	}

}
