import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        String nome;
        while (true){
            System.out.print("Nome: ");
            nome = leia.next();
            if (nome.equals("0")) break;
            System.out.println("Bem-Vindo(a), " + nome);
        }

        leia.close();
    }
}
