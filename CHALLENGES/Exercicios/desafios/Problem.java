import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
    int maxCaracteres = 30;
    int qtdNomes = 10;
    String[] nomes = new String[qtdNomes];

    for(int i=1; i<nomes.length;i++){
      String entrada = scanner.nextLine();
      while(entrada.length() > maxCaracteres){
        System.out.println("MAX DE 30 CARACTERES!");
        entrada = scanner.nextLine();
      }
      nomes[i] = entrada;
      if(i == 3){
        System.out.println(nomes[i]);
      }else if(i == 7){
        System.out.println(nomes[i]);
      }else if(i == 9){
        System.out.println(nomes[i]);
      }     
    }
    scanner.close();
	}
}