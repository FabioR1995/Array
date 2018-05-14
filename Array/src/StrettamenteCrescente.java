import java.util.Scanner;

public class StrettamenteCrescente {
	
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

