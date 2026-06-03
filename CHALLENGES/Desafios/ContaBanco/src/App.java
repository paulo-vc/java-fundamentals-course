import br.com.conta.*;
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        Random numGerador = new Random();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal contaUm = new ContaTerminal();

        int idAleatorio = numGerador.nextInt(1000);
        contaUm.setId(idAleatorio);

        System.out.println("Digite a agência: ");
        contaUm.setAgencia(scanner.nextLine());
        System.out.println("Digite seu nome completo: ");
        contaUm.setNome(scanner.nextLine());
        System.out.println("Insira o saldo a se trasnferir: ");
        contaUm.setSaldo(scanner.nextDouble());

        System.out.println("ID: " + contaUm.idConta + "\nNome: " + contaUm.nomeUsuario + "\nAgencia: " + contaUm.agenciaConta + "\nSaldo: "+ contaUm.saldoDisponivel);

        scanner.close();
    }
}
