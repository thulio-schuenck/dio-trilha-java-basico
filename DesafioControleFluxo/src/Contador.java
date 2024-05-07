import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        }catch(ParametroInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if(parametroUm > parametroDois) 
        throw new ParametroInvalidosException();
            
        int contagem = parametroDois - parametroUm;
        for (contagem = parametroUm; contagem <= parametroDois; contagem++){
                System.out.println("imprimindo o número " + contagem);
        }
    }
}
