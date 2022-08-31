package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.PagadorDerImposto;
import entidades.PagadorFisico;
import entidades.PessoaJuridica;

public class Programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<PagadorDerImposto> pagador = new ArrayList<>();
		
		System.out.println("Digite o numero de contribuintes: ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println("Dados do pagador de imposto #"+ i);
			System.out.println("Pessoa Fisica ou Juridica? (f/j)");
			String resposta = sc.next();
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Renda anual:");
			Double renda = sc.nextDouble();
			if(resposta.equals("f")){
				System.out.println("Gastos com saude:");
				Double gastoSaude = sc.nextDouble();
				pagador.add(new PagadorFisico(nome, renda, gastoSaude));
			}
			else {
				System.out.println("Numero de Funcionarios:");
				int numero_Funcionario = sc.nextInt();
				pagador.add(new PessoaJuridica(nome, renda, numero_Funcionario));
			}
		}
		System.out.println("\nImpostos Pagos:\n");
		for(PagadorDerImposto pag: pagador) {
			System.out.println(pag.getNome() + " : R$ " + String.format("%.2f", pag.imposto() ));
		}
		double soma=0.0;
		System.out.println("\nTotal dos Impostos:\n");
		for(PagadorDerImposto pag: pagador) {
			soma = soma + pag.imposto();
		}
		System.out.printf("R$  %.2f", soma);
		

	}

}
