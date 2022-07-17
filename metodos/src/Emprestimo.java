public class Emprestimo {
    double valor, valorTotal, valorParcela, valorTaxas;
    int parcelas;
    double taxa = 4.5;

    public void valorFinal(double valor, int parcelas){
        valorTaxas = (valor * (taxa/100)) * parcelas;
        valorTotal = valor + valorTaxas;
        valorParcela = valorTotal / parcelas;
        System.out.println("O valor total de taxas: " + valorTaxas);
        System.out.println("Valor da parcela: " + valorParcela);
        System.out.println("Valor total do emprestimo: " + valorTotal);
    }
}
