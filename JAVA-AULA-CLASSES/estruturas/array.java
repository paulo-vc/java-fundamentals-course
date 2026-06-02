public class array {

    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "PAULO"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        int num2 = 1;
        while (num2 == 3){
            System.out.println("teste");
        }
        int num = 5, count = 1; 
        do { num += count; 
            System.out.println(num); 
        } while (count > 3);
        
        int numero = 1; 
        for (int x=1; x<2; x++)
            { numero = numero + x; } 
        System.out.println("O valor de número é: " + numero);


        boolean condicao = false; 
        while(condicao){ 
            System.out.println("executou ... "); 
        }
    }
}

