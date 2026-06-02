public class Metodos {
    public class Jogador {
        private int vida = 100;
        public void tomarDano(int dano) {
            this.vida -= dano; 
        }
    }
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();        
        jogador1.tomarDano(20);
    }
}


/*
tomarDano é public porque a ação de causar dano vem de fora do jogador.
Exemplo:
O jogador1 toma um tiro, o inimigo é uam classe e o jogador é outra.
Se o tomarDano fosse private a classe Inimigo não conseguiria enxergar esse método para ativa-lo.
*/

// Dentro da classe Armadilha:
public void causarExplosao(Jogador jogadorAlvo) {
    // Se tomarDano for PUBLIC, isso funciona:
    jogadorAlvo.tomarDano(50); 
}
/*
O encapsulamento continua funcionando pois a variavel vida é private, então o inimigo não altera a vida do jogador diretamente, ele é obrigado a passar pelo método público tomarDano()
onde a gente pode adicionar outras regras tipo:
*/
public void tomarDano(int dano){
    if(this.estaComEscudo){
        dano = dano / 2;
    }
    this.vida -= dano;
}

/*
Não se da para criar classe privada no topo do arquivo, mas você pode criar uma classe privada dentro de outra classe.

Agora se o método tomarDano fosse static aí ele pertenceria a classe como um todo e não ao jogador número 1 específico.

Um método static não consegue mexer em variáveis que não sejam estáticas.

Então se a gente transformasse a vida em static também aí seria um jogo aonde teriamos a vida compartilhada.
*/