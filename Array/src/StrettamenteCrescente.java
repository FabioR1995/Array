import java.util.Scanner;

public class StrettamenteCrescente {

	public static void main(String[] args) {
		Scanner tastiera= new Scanner(System.in);
		double[] array=new double[4];
		System.out.println("Inserisci un valore positivo");
		array[0]=tastiera.nextDouble();
		for(int i=1;i<array.length;i++){
			System.out.println("Inserisci un valore positivo");
			array[i]=tastiera.nextDouble();
			System.out.println(array[i-1]+">"+array[i]+"?");
			System.out.println(strettamenteCrescente(array));
			System.out.println("========================================================");
		}
	}
	
	public static boolean strettamenteCrescente(double[]in){
		boolean risposta = true;  //verifica universale
		double max;
		int i=0;
		while(i<in.length-1 && risposta){
			if(in[i]>=in[i+1])
				risposta=false;
			i++;
		}
		return risposta;
	}
}

