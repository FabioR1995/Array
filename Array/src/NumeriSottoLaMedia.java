import java.util.Scanner;

public class NumeriSottoLaMedia {

	public static void main(String[] args) {
		int temperatura;
		double sommaTemperature=0;
		int valoriInseriti;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Quanti valori di temperatura vuoi inserire?");
		temperatura= tastiera.nextInt();
		double [] temperature= new double[temperatura];
		for(int i=0; i<temperature.length;i++) {
			System.out.println("Inserisci la "+i+" temperatura");
			valoriInseriti=tastiera.nextInt();
			temperature[i]=valoriInseriti;
			sommaTemperature= sommaTemperature+temperature[i];
		}
		double temperaturaMedia= sommaTemperature/temperature.length;
		System.out.println("La media delle temperature e': "+ temperaturaMedia);
	}

}
