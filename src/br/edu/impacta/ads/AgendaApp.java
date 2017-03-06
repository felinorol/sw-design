package br.edu.impacta.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class AgendaApp {
	
	public static Scanner entrada = new Scanner(System.in);
	public static List<Contato> contatos = new ArrayList<>();

	public static void main(String[] args) {
		boolean sair = false;
		while (!sair){
			int opcao = apresentarMenuPrincipal();
			switch(opcao) {
			case 1: inserirContato();break;
			case 2: buscarContato(); break;
			default: out.println("Erro: Opção Invalida!");
			}		
		}
		out.println("/n Fim do Programa!");
	}

	private static int apresentarMenuPrincipal() {
		boolean inteiro = false;
		int opcao = 0;
		while(!inteiro){
			out.println("/n AGENDA TELEFONICA!");
			out.println("(1) Inserir");
			out.println("(2) Buscar");
			out.println("(3) Sair");
			out.println("Escolha uma Opção: ");
			String s = entrada.nextLine();
			
			try{
				opcao = Integer.parseInt(s);
				inteiro = true;
			} catch(Exception e){
				out.println("Erro: Opção deve ser um valor inteiro!");
			}
		}
		return opcao;
	}
	
	private static void inserirContato() {
		out.println("/n INSERIR NOVO CONTATO:");
		String nome = lerNome();
		String telefone = lerTelefone();
		Contato c = new Contato(nome , telefone);
		if (contatos.contains(c)){
			out.println("Este Contato já está cadastrado!");
		}
		else {
			contatos.add(c);
			out.println("Contato inserido com sucesso!");
		}
		
	}

	private static String lerNome() {
		// TODO Auto-generated method stub
		// parei na pagina 54 
		// file:///C:/Users/Ronaldo/Downloads/gcm-aula04.pdf
		return nome;
	}
	
	

}
