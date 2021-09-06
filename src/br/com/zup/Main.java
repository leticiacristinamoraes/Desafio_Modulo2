package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, seja bem vinde ao sistema Estrela.");

        Map<String, String> listaDeFuncionarios = new HashMap<String, String>();

        System.out.println("Para cadastrar um novo funcionário, digite o CPF do colaborador:");
        String cpf = leitor.nextLine();
        System.out.println("Digite agora o nome completo do colaborador:");
        String nomeFuncionario = leitor.nextLine();
        System.out.println("Digite o e-mail do colaborador:");
        String email = leitor.nextLine();
        System.out.println("Para finalizar o cadastro, digite o telefone do colaborador:");
        String telefone = leitor.nextLine();

        listaDeFuncionarios.put("CPF do colaborador:" + cpf, "\nNome do colaborador: " + nomeFuncionario + "\nEmail: " + email + "\nTelefone: " + telefone);
        System.out.println(listaDeFuncionarios);
    }
}
