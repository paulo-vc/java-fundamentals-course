public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Paulo";
        String segundoNome = "Vinicius";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
