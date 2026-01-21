public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salario = 5500.00;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // declarando uma variável constante - usar "final" e sempre nome seja em maiúsculo
        final double VALOR_DE_PI = 3.14;
        String meuNome = "Rafael";
        


        int numero = 1;
        numero = 2;
        salario = 6500.00;

        System.out.println(numero);
        System.out.println(numeroCurto2);
        System.out.println(salario);
        System.out.println(VALOR_DE_PI);
        System.out.println(meuNome );

    }
}
