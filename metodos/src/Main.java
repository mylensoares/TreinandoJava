import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Calculadora com operações básicas
        System.out.println("===============Calculadora===============");
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
        System.out.println("===============Mensagem===============");
        Mensagem mens = new Mensagem();
        System.out.print("Informe o horário atual (formato 24h): ");
        mens.hora = leia.nextInt();
        mens.obterMensagem(mens.hora);

        // Simulador de Empréstimo
        System.out.println("===============Empréstimo===============");
        Emprestimo emp = new Emprestimo();

        System.out.print("Valor do Empréstimo: ");
        emp.valor = leia.nextDouble();
        
        System.out.print("Quantidade de Parcelas: ");
        emp.parcelas = leia.nextInt();

        emp.valorFinal(emp.valor, emp.parcelas);


        leia.close();
    }

    
}
