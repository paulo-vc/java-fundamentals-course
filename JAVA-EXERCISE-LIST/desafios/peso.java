import java.util.Scanner;

public class peso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos casos?");
        int casos = sc.nextInt();

        sc.nextLine();

        String[] nomes = new String[casos];
        int[] newtons = new int[casos];

        for(int i=0; i < casos; i++){
            System.out.println("Digite o nome: ");
            nomes[i] = sc.nextLine();

            System.out.println("Digite a força em newtons: ");
            newtons[i]=sc.nextInt();

            sc.nextLine();
            
            if(newtons[i] >= 1 && newtons[i] < 2500){
                System.out.println(nomes[i] +" "+ newtons[i] +" "+ "N");
            }else if(newtons[i]<=0){
                System.out.println("Número inválido!");
            }else{
                System.out.println(nomes[i] +" "+ newtons[i] +" "+ "Y");
            }
        }
        sc.close();
    }
}
