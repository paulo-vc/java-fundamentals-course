Vou dar um exemplo de escopo:

uma variável dentro de um método não é utilizável fora do escopo dela

public class sacar(double valor){
    //isso é uma variável local de método
    double novoSaldo = saldo - valor;
}

se eu fizesse um

public void imprimirSaldo(){
    System.out.println(saldo);
    System.out.println(novoSaldo); //ele não iria reconhecer pq somente o método sacar reconhece essa variável
}

variáveis dentro de um escopo de fluxo tmb não são visíveis fora dela

Por exemplo

tem uma classe x{
    double y;
    for(int i = x x x){
        double x = x + y;
    } //somente y será visivel do lado de fora pois foi declarada dentro da classe, enquanto x foi declarado dentro do escopo do fluxo do for
    return y;
}

import java.util.Locale
import java.util.Scanner

Scanner scanner = new Scanner(System.in).useLocale(Locale.BR)

int idade = scanner.nextInt();
String nome = scanner.next();