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

        // Calculo de área de quadriláteros
        Quadrilatero quadrado = new Quadrilatero();
        Quadrilatero retangulo = new Quadrilatero();
        Quadrilatero trapezio = new Quadrilatero();

        System.out.print("Informe o valor do lado do quadrado em metros: ");
        quadrado.ladoQuad = leia.nextDouble();
        double areaQuadrado = quadrado.areaQuadrado(quadrado.ladoQuad);
        
        System.out.print("Altura do retângulo: ");
        retangulo.lado1 = leia.nextDouble();
        System.out.print("Base do retângulo: ");
        retangulo.lado2 = leia.nextDouble();
        double areaRetangulo = retangulo.areaRetangulo(retangulo.lado1, retangulo.lado2);

        System.out.print("Base menor do trapézio: ");
        trapezio.baseMenor = leia.nextDouble();
        System.out.print("Base maior do trapézio: ");
        trapezio.baseMaior = leia.nextDouble();
        System.out.print("Altura do trapézio: ");
        trapezio.altura = leia.nextDouble();
        double areaTrapezio = trapezio.areaTrapezio(trapezio.baseMaior, trapezio.baseMenor, trapezio.altura);

        System.out.println("===============Quadriláteros===============");
        System.out.println("Área do Quadrado: " + areaQuadrado + " m²");
        System.out.println("Área do Retângulo: " + areaRetangulo + " m²");
        System.out.println("Área do Trapézio: " + areaTrapezio + " m²");

        leia.close();
    }

    
}
