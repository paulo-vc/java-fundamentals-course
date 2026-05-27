public class Concatenar{


    public static void main(String[] args) {
        String concatenacao="2";
        System.out.println(1+1+1+concatenacao);
        System.out.println(concatenacao+1+1+1);
        System.out.println(concatenacao+(1+1+1));

        int numero = 4;
        System.out.println(-numero);
        System.out.println(numero);
        boolean legal = true;
        System.out.println(legal);
        System.out.println(!legal);

        //operador ternário:
        int a=2,b=3;
        String resultado = a==b ? "true" : "false";
        System.out.println(resultado);

    }

}