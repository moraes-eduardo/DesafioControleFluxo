import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
     
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            
            terminal.close();		
		
		} catch (IllegalArgumentException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new IllegalArgumentException();
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
	}

}
