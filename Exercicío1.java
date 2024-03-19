import java.util.Scanner; 

public class Exercicío1 { 

    public static void main(String[] args) throws Exception { 

        Scanner scanner = new Scanner(System.in); 

        double numero1; 

        double numero2; 

        double calculo; 

        System.out.println("Digite o primeiro número: "); 

        numero1 = scanner.nextDouble(); 

        System.out.println("Digite o segundo número: "); 

        numero2 = scanner.nextDouble(); 

        if (numero1 == 0){ 

            System.out.println("Não é possível dividir por zero. Por favor, escolha outro divisor");   

        } 

        if (numero2 != 0){ 

            calculo = numero1 / numero2; 

 

            System.out.println("O resultado do divisor é: " + calculo); 

        } else { 

            System.out.println("Não é possível dividir por zero. Por favor, escolha outro divisor"); 

        } 

         scanner.close(); 

    } 

} 