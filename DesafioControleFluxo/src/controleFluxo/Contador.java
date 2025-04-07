package controleFluxo;

import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("Os parâmetros não seguem as regras de negócio. Favor inserir os números novamente.");
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
		    throw new ParametrosInvalidosException("O parâmetro secundário deve ser maior que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número: " + i);
        }
	}
}
