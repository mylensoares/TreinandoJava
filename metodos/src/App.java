import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Calculadora com operações básicas
        Calculadora calc = new Calculadora();
        Scanner leia = new Scanner(System.in);

        System.out.print("Primeiro Número: ");
        calc.num1 = leia.nextInt();

        System.out.print("Segundo Número: ");
        calc.num2 = leia.nextInt();

        calc.soma(calc.num1, calc.num2);
        calc.subtracao(calc.num1, calc.num2);
        calc.multiplicacao(calc.num1, calc.num2);
        calc.divisao(calc.num1, calc.num2);

        

        // Mensagem
        Mensagem mens = new Mensagem();
        System.out.print("Informe o horário atual (formato 24h): ");
        mens.hora = leia.nextInt();
        mens.obterMensagem(mens.hora);
        leia.close();
    }

    
}
