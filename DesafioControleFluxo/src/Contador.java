import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        AdicionaLinhaHorizontal();
        System.out.println("Olá! A seguir, favor informe dois números.");
        System.out.println("Favor atente-se: os números devem ser inteiros, e o segundo deve ser o maior.");
        AdicionaLinhaHorizontal();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número inteiro: ");
        try {
            int number1 = input.nextInt();
            System.out.print("Agora informe o segundo número inteiro (maior que o anterior): ");
            int number2 = input.nextInt();
            System.out.println("");
            input.close();
            int totalNumeros = DeterminaTotalNumeros(number1,number2);
            AdicionaLinhaHorizontal();
            System.out.println("Total de números a serem impressos: "+totalNumeros+". Imprimindo.....\n");
            for (int i = 0 ; i< totalNumeros ; i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
            AdicionaLinhaHorizontal();
        } catch (java.util.InputMismatchException e) {
            AdicionaLinhaHorizontal();
            System.err.println("##### ERRO: Favor atente-se ao tipo do input requerido. Ambos devem ser NÚMEROS INTEIROS. #####");
            AdicionaLinhaHorizontal();
        } catch (ParametrosInvalidosException e){
            AdicionaLinhaHorizontal();
            System.err.println("##### ERRO: Favor atente-se ao requisito: o segundo número deve ser MAIOR que o primeiro. #####");
            AdicionaLinhaHorizontal();
        }
    }
    
    public static int DeterminaTotalNumeros(int number1, int number2) throws ParametrosInvalidosException {
        if(number1 > number2){
            throw new ParametrosInvalidosException();
        }
        return number2-number1;
    }

    private static void AdicionaLinhaHorizontal(){
        System.out.println("__________________________________________________________________________________\n");
    }
}
