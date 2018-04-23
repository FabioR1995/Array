import java.util.Scanner;

public class ContaFamiglie {

	public static void main(String[] args) {
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci il numero di redditi che vuoi definire:");
		int k=tastiera.nextInt();
		double[] reddito=new double[k];
		redditoFamiglia(reddito, k);
		}
	
	
	public static void redditoFamiglia(double[]reddito, int k){
		Scanner tastiera= new Scanner(System.in);
		double maxReddito=0;
		
		for(int i=0;i<reddito.length;i++){
			System.out.println("Inserisci il reddito della famiglia "+i);
			reddito[i]=tastiera.nextDouble();
			if(maxReddito<reddito[i])  //Definisco il reddito massimo
				maxReddito=reddito[i];
		}
		System.out.println();
		System.out.println("il reddito max e': "+maxReddito);
		
		double calcoloReddito;
		int redditoInferiore=0;
		calcoloReddito= (maxReddito*90)/100;   //reddito inferiore fino al 10% del reddito massimo
		System.out.println("Il reddito inferiore fino al 10% rispetto al reddito massimo vale: "+calcoloReddito);
		for(int j=0;j<reddito.length;j++)
			if(reddito[j]<calcoloReddito)
				redditoInferiore++;
		System.out.println("Le famiglie con reddito inferiore fino al 10% rispetto al reddito massimo sono:"+ redditoInferiore);
	}
}


