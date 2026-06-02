public class testes {
    public static void main(String[] args) {
        int num = -2;
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        if (num >= 1){
            System.out.println("Numero positivo");
        }
        else if(num == 0){
            System.out.println("Zero não pode");
        }
        
        else{
            System.out.println("Numero negativo");
        }

        switch(num){
            case 1:{
                System.out.println("O numero é 1");
                break;
            }
            case 2:{
                System.out.println("O numero é 2");
                break;
            }
            default:{
                System.out.println("Não é um nem dois");
                break;
            }
        }
    }
}
