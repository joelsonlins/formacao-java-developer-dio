package modulo_01;

public class Operadores {
    public static void main(String[] args){
//        String nomeCompleto = "LINGUAGEM" + "JAVA";
//        System.out.println(nomeCompleto);
/*
        String concatenacao  ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

 */
/*
            int a, b;
            a = 5;
            b = 6;
//            String resultado = "";
//            if(a==b)
//                    resultado ="verdadeiro";
//            else
//                    resultado = "falso";
            String resultado = a == b ? "verdadeiro" : "falso";

            System.out.println(resultado);
             */

            /*
            int numero1 = 1;
            int numero2 =2;

            boolean simNao = numero1 == numero2;

            System.out.println("numeroUm é igual a numeroDois? " + simNao);

            simNao = numero1 != numero2;

            System.out.println("numeroUm é diferente a numeroDois? " + simNao);

            simNao = numero1 > numero2;

            System.out.println("numeroUm é maior a numeroDois? " + simNao);

            if(numero1 < numero2){
                System.out.println("A nossa condição é verdadeira");
            }

            String nomeUm = "Antonio";
            String nomeDois = new String("Antonio");

            System.out.println(nomeUm.equals(nomeDois));

             */

            boolean condicao1=true;
            boolean condicao2=false;

            if(condicao1 && condicao2){
                    System.out.println("As duas condições são verdadeiras");
            }

            if (condicao1 || condicao2){
                    System.out.println("Uma das condições é verdadeira");
            }
    }

}
