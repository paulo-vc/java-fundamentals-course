import com.excecoes.*;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro parametro: ");
        parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parametro: ");
        parametroDois = sc.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;

        for(int i=1; i <= contagem; i++){
            System.out.println("Número: " + i);
        }
    }
}
