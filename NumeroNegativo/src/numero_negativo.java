import java.util.Scanner;

public class numero_negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		System.out.println("DIGITE UM NUMERO");

		int N = sc.nextInt();
			
				if (N <0 ) {
					System.out.println("NEGATIVO");
				}
				else {
				   System.out.println("NÃO NEGATIVO");
				}

				
				sc.close();

	}

}
