package modulo_01;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception{

        String meuNome = "José Lucas";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numertoCurto2 = (short) numeroNormal;

        int numero = 5;

        numero=10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //garante que ela seja uma constante

    }
}
