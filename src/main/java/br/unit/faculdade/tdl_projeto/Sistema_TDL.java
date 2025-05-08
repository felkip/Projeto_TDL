package br.unit.faculdade.tdl_projeto;

import java.util.Scanner;

public class Sistema_TDL {

    public static void main(String[] args) {
        Lista_Encadeada to_do_list= new Lista_Encadeada();
	        Scanner input = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\nSistema de Gerenciamento de Tarefas");
	            System.out.println();
	            System.out.println("1. Adicionar Tarefa");
	            System.out.println("2. Remover Tarefa");
	            System.out.println("3. Editar Tarefa");
	            System.out.println("4. Buscar Tarefa Específica");
	            System.out.println("5. Listar Tarefas");
	            System.out.println("6. Listar Tarefas Pendentes");
	            System.out.println("7. Listar Tarefas (Ordem Reversa)");
	            System.out.println("0. Sair");
	            System.out.println();
	            System.out.print("Qual opção você escolhe ? ");

	            opcao = input.nextInt();
	            input.nextLine(); 

	            switch (opcao) {
                case 1 -> {
                    System.out.print("Descrição da tarefa: ");
                    String descricao = input.nextLine();
                    System.out.print("Prioridade da tarefa: ");
                    int prioridade = input.nextInt();
                    to_do_list.adicionarTarefa(descricao, prioridade);
                }
                case 2 -> {
                    System.out.print("Descrição da tarefa a remover: ");
                    String descricaoRemover = input.nextLine();
                    if (to_do_list.removerTarefa(descricaoRemover)) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                }
                case 3 -> {
                    System.out.print("ID da tarefa a editar: ");
                    int idEditar = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Nova descrição: ");
                    String novaDescricao = input.nextLine();
                    System.out.print("Nova prioridade: ");
                    int novaPrioridade = input.nextInt();
                    if (to_do_list.editarTarefas(idEditar, novaDescricao, novaPrioridade)) {
                        System.out.println("Tarefa editada com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                }
                case 4 -> {
                    System.out.print("ID da tarefa a buscar: ");
                    int idBuscar = input.nextInt();
                    Tarefa tarefaEncontrada = to_do_list.buscarTarefaEspecifica(idBuscar);
                    if (tarefaEncontrada != null) {
                        System.out.println("Tarefa encontrada: " + tarefaEncontrada);
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                }
                case 5 -> {
                    System.out.println("Lista de tarefas:");
                    to_do_list.exibirTarefas();
                }
                case 6 -> {
                    System.out.println("Tarefas pendentes:");
                    to_do_list.listarTarefasPendentes();
                }
                case 7 -> {
                    System.out.println("Lista em ordem reversa :");
                    to_do_list.exibirTarefas_Reverso();
                }
                case 0 -> System.out.println("Saindo do sistema.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);	    }
    }   
    
