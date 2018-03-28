import java.util.Scanner;

public class ContaFamiglie {

	public static void main(String[] args) {
		int k; //rappresenta un intero che indica quanti valori ci sono nell' array
		int valoreReddito;
		double maxReddito;
		double calcoloReddito=0;
		int contaRedditoInferiore=0;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Quanti redditi devono essere inseriti?");
		k= tastiera.nextInt();
		double[] reddito= new double[k];
		maxReddito=0;
		
		for(int i=0; i<reddito.length;i++){
			System.out.println("Inserisci il reddito della "+i+" famiglia");
			valoreReddito= tastiera.nextInt();
			reddito[i]=valoreReddito;
			
			if (i==0)
				maxReddito=reddito[0]; 
			
			if(reddito[i]>maxReddito)
				maxReddito=reddito[i];
		}
		
		System.out.println("il reddito max e': "+maxReddito);
		calcoloReddito= (maxReddito*90)/100; //reddito inferiore fino al 10% del reddito massimo
		
		for(int j=0;j<reddito.length;j++)
			if(reddito[j]<calcoloReddito)
				contaRedditoInferiore++;
		
		System.out.println("Le famiglie con reddito inferiore fino al 10% rispetto al reddito massimo sono:"+ contaRedditoInferiore);
		}
}


