package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Map<String, String> listaDeFuncionarios = new HashMap<String, String>();
        System.out.println("Olá, seja bem vinde ao sistema Estrela.");
        int opcaoDesejada = 0;
        int chave = 0;

        while (chave == 0) {

            System.out.println("Digite 1 para cadastrar um novo funcionário.");
            System.out.println("Digite 2 para visualizar a lista de funcionários.");
            System.out.println("Digite 3 para remover um funcionário cadastrado utilizando o CPF.");
            System.out.println("Digite 4 para sair do programa.");

            opcaoDesejada = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoDesejada) {
                case 1:
                    System.out.println("Para cadastrar um novo funcionário, digite o CPF do colaborador:");
                    String cpf = leitor.nextLine();
                    System.out.println("Digite agora o nome completo do colaborador:");
                    String nomeFuncionario = leitor.nextLine();
                    System.out.println("Digite o e-mail do colaborador:");
                    String email = leitor.nextLine();
                    System.out.println("Para finalizar o cadastro, digite o telefone do colaborador:");
                    String telefone = leitor.nextLine();

                    if (listaDeFuncionarios.size() != 0) {
                        for (String validarCpf : listaDeFuncionarios.keySet()) {
                            if (validarCpf.equals(cpf)) {
                                System.out.println("O CPF informado já foi cadastrado. Por favor, verifique novamente.");
                            } else {
                                listaDeFuncionarios.put(cpf, "Nome do funcionário: " + nomeFuncionario + "\nEmail: " + email + "\nTelefone: " + telefone + "\n################");
                                System.out.println("Funcionário cadastrado com sucesso!");
                            }
                        }
                    } else {
                        listaDeFuncionarios.put(cpf, "Nome do funcionário: " + nomeFuncionario + "\nEmail: " + email + "\nTelefone: " + telefone + "\n################");
                        System.out.println("Funcionário cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    for (String verificarLista : listaDeFuncionarios.keySet()) {
                        System.out.println("CPF: " + verificarLista + "\n" + listaDeFuncionarios.get(verificarLista));
                    }
                    break;
                case 3:
                    System.out.println("Digite o CPF do funcionário que deseja remover da lista:");
                    String cpfDeletado = "";
                    String deletarCpf = leitor.nextLine();

                    for (String verificarCpf : listaDeFuncionarios.keySet()) {
                        if (verificarCpf.equals(deletarCpf)) {
                            System.out.println("A exclusão do cadastro foi realizada com sucesso!");
                            cpfDeletado = deletarCpf;
                        } else {
                            System.out.println("O CPF digitado não pode ser encontrado. Por favor, digite um CPF válido.");
                        }
                    }
                    listaDeFuncionarios.remove(cpfDeletado);

                    break;

                case 4:
                    chave = 1;
                    System.out.println("Obrigada por utilizar nosso sistema.");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }

        }


    }
}

