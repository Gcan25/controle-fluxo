import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        
    Scanner terminal = new Scanner(System.in); 
    System.out.println("Digite o primeiro parâmetro:  ");
    int parametroUm = terminal.nextInt();
    System.out.println("DIgite o segundo parâmetro: ");
    int parametroDois = terminal.nextInt();
        
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        contar(parametroUm, parametroDois);
    
    
    }
    
    static void contar(int parametroUm, int parametroDois) {
    int contagem = parametroDois - parametroUm;

        for (int i = 1 ; i <= contagem; i++) {
            System.out.println("Contagem: " + i);
        }
    }

}

