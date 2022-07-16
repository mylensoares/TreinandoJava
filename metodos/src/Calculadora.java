public class Calculadora {
    int num1, num2, soma, subtracao, multiplicacao;
    double divisao;

    public void soma(int num1, int num2){
        soma = num1 + num2;
        System.out.println("A soma entre " + num1 + " e " + num2 + " é " + soma);
    }

    public void subtracao(int num1, int num2){
        subtracao = num1 - num2;
        System.out.println("A subtração entre " + num1 + " e " + num2 + " é " + subtracao);
    }

    public void multiplicacao(int num1, int num2){
        multiplicacao = num1 * num2;
        System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é " + multiplicacao);

    }

    public void divisao(int num1, int num2){
        divisao = num1 / num2;
        System.out.println("A divisão entre " + num1 + " e " + num2 + " é " + divisao);
    }
}
