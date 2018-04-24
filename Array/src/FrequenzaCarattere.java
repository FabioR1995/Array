import java.util.Scanner;

public class FrequenzaCarattere {

	public static void main(String[] args) {
		int[] cifra= new int[10];
		Scanner tastiera= new Scanner(System.in);
		String telefono;
		char numero;
		long nuovoNumero = 0;
		
		for(int j=0;j<cifra.length;j++){
			System.out.println("Inserisci il numero di telefono");
			telefono=tastiera.next();
			System.out.println("Quale e' il numero che vuoi sapere quante volte e' ripetuto?");
			numero=tastiera.next().charAt(0);
			cifra[j]=contaCifre(telefono, numero);
			System.out.println("Questo numero e' stato ripetuto: "+cifra[j]);
			System.out.println("==================================================================");
		}
		
		for(int i=0;i<cifra.length;i++){
			System.out.print(cifra[i]);
		} 
		
		
	}
	
	
	public static int contaCifre(String telefono,char numero){
		int contaCarattere=0;
		for(int i=0;i<telefono.length();i++){
			if(telefono.charAt(i)==numero)
				contaCarattere++;
		}
		return contaCarattere;
	}
}
