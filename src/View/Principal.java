package View;

import Controller.controlaListaSimples;
import Model.No;
import java.util.Scanner;

public class Principal {

    static Scanner entrada = new Scanner(System.in);
    static controlaListaSimples controlaListaSimples = new controlaListaSimples();

    public static void menu() {
        System.out.println("\tCadastro de Alunos");
        System.out.println("0. Finalizar");
        System.out.println("1. Incluir");
        System.out.println("2. Alterar");
        System.out.println("3. Excluir");
        System.out.println("4. Visualizar");
        System.out.print("Opcao:");
    }

    public static void incluir() {
        //System.out.println("Você entrou no método Incluir.");

        String nome, cpf;

        System.out.print("Informe o nome do aluno:");
        entrada.nextLine();
        nome = entrada.nextLine();
        System.out.print("Informe o CPF do aluno: ");
        cpf = entrada.nextLine();

        No novoNo = new No(nome, cpf);

        controlaListaSimples.inserirNoFinalDaLista(novoNo);

    }

    public static void alterar() {
        System.out.println("Você entrou no método Alterar.");

        String nome, cpf;
        No ultimoNo = controlaListaSimples.visualizarUltimoNoLista();

        int resposta;

        System.out.println("Último nó da lista (NOME/CPF): " + ultimoNo.nome + "/" + ultimoNo.cpf);
        System.out.println("Deseja realmente alterar o último nó da lista ?");
        System.out.println("0 - NÃO");
        System.out.println("1 - SIM");
        resposta = entrada.nextInt();

        if (resposta == 1) {

            System.out.print("Informe o NOVO nome do aluno:");
            entrada.nextLine();
            nome = entrada.nextLine();
            System.out.print("Informe o NOVO CPF do aluno: ");
            cpf = entrada.nextLine();

            No noAtualizado = new No(nome, cpf);
            controlaListaSimples.alterarNoFinalDaLista(noAtualizado);
            

        }else{
            System.out.println("O último nó não foi atualizado!!");
        }
    }

    public static void excluir() {
        System.out.println("Você entrou no método Excluir.");
        
        No ultimoNo = controlaListaSimples.visualizarUltimoNoLista();

        int resposta;

        System.out.println("Último nó da lista (NOME/CPF): " + ultimoNo.nome + "/" + ultimoNo.cpf);
        System.out.println("Deseja realmente EXCLUIR o último nó da lista ?");
        System.out.println("0 - NÃO");
        System.out.println("1 - SIM");
        resposta = entrada.nextInt();

        if (resposta == 1) {

            controlaListaSimples.excluirNoFinalDaLista();            

        }else{
            System.out.println("O último nó não foi EXCLUIDO!!");
        }        
        
        
    }

    public static void visualizar() {
        //System.out.println("Você entrou no método Visualizar.");

        controlaListaSimples.visualizarNos();
    }

    public static void sair() {
        System.out.println("Obrigado!");
    }

    public static void separador() {
        System.out.println("===========XXX=============");
    }

    public static void main(String[] args) {
        int opcao;

        do {
            separador();
            menu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    separador();
                    incluir();
                    break;

                case 2:
                    separador();
                    alterar();
                    break;

                case 3:
                    separador();
                    excluir();
                    break;

                case 4:
                    separador();
                    visualizar();
                    break;

                case 0:
                    separador();
                    sair();
                    break;

                default:
                    separador();
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

}
