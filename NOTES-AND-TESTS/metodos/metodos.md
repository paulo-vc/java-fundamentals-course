métodos são tipo funções em C porém orientado a objetos

NÃO EXISTE o conceito de métodos globais, todos métodos são sempre definidos dentro de uma classe.

1. Qual a proposta do método?
2. Qual o tipo de retorno esperado após a execução do método? (void)

4 níveis de visibilidade de um método:
toda aplicação
somente no pacote
através de herança
somente a nível da própria classe

public int somar(int num1, int num2){
    int answer = num1+num2;
    return answer;
}

Public = quem acessa
int = tipo do método
somar = nome do método
num1,num2 = parâmetros passados para ele
return answer = o que o método retorna
{corpo}


//

Visibilidade

Os modificadores public, private e protected controlam quem pode acessar o método e o encapsulamento.

**Protected**
É o método protegido, somente pode ser usado para o mesmo pacote ou para classes que puxaram essa herança. Área restrita.

**Private**
Apenas a própria classe pode ter acesso a ele, por exemplo, um usuário comúm não precisa ter acesso a base da plataforma, ele só quer fazer o login e pronto.
Um método private seria algo como validarCPF() aonde somente quem irá usa-lo é o cadastrarCliente() (que está na mesma classe);

**Public**
Qualquer um pode acessar essa classe de qualquer lugar, basicamente uma porta de entrada.
Ex: fazerLogin();

//

Classe e Objeto

Classe é o molde do objeto, como se você tivesse colocando no papel o que precisa pra constituir um carro
Objeto é o carro em si

Um exemplo seria:

public class Carro{
    String modelo;
    int velocidade
}

public class Main{
    Carro meuCarro = new Carro;
}

//

Um método Static não precisa instânciar o objeto, você pode só usar ele pois não é algo que sofrerá alteração.
Ele deve ser static se ele faz uma ação usando APENAS os dados que eu passar para ele no momento, sem precisar olhar para nenhuma variável de fora. (Como somar dois numeros)
Ele não deve ser static quando precisa consultar ou alterar o estado interno de um objeto (como a fome de um animal, o saldo de uma conta).

//

Encapsulamento consiste em proteger os dados contra outros acessos, por isso usamos private e protected, para somente a classe em si conseguir ter acesso a alguma variavel.
Herança é uma classe herdar atributos e métodos de outra classe pra reaproveitar o código