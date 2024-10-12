package com.mycompany.agendacontatos;
import java.util.Scanner;
import java.util.ArrayList;

public class AgendaContatos {
    
    private static ArrayList<String> nome = new ArrayList<>();
    private static ArrayList<String> email = new ArrayList<>();
    private static ArrayList<String> telefone = new ArrayList<>();
    private static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {

    int opc;
    while (true) {
        System.out.println("------------- AGENDA DE CONTATOS -------------");
        System.out.println("[1] LISTAR CONTATOS ");
        System.out.println("[2] ADICIONAR CONTATO");
        System.out.println("[3] REMOVER CONTATO");
        System.out.println("[4] ATUALIZAR CONTATO");
        System.out.println("[5] SAIR");
        System.out.print("Escolha uma opção: ");
        try {
            opc = ler.nextInt(); // Lê a opção do usuário
        } catch (Exception e) {
            System.out.println("Erro ao ler a opção. Certifique-se de inserir um número.");
            ler.nextLine(); // Limpa o buffer do Scanner
            continue; // Volta para o início do loop
        }
        
        switch (opc) {
            case 1:
                listarContatos();
            break;
                case 2:
                    adicionarContato();
                break;
                    case 3:
                    removerContato();
                    break;
                        case 4:
                        atualizarContato();
                        break;
                            case 5:
                            System.out.println("Encerrando a aplicação. Obrigado!");
                            ler.close(); // Fecha o scanner antes de sair
                            System.exit(0); // Encerra o programa
                            break;
                            default:
        System.out.println("Opção inválida! Tente novamente.");
        }
       
      }
        
    }
    
    
        // Método para listar os contatos
        private static void listarContatos() {

        do {
            System.out.println("------------- LISTA DE CONTATOS -------------");
            if (nome.isEmpty()) {
                System.out.println("A agenda está vazia!");
            } else {
                for (int i = 0; i < nome.size(); i++) {
                    System.out.println("------------- CONTATO " + (i + 1) + " ----------");
                    System.out.println("NOME: " + nome.get(i));
                    System.out.println("TELEFONE: " + telefone.get(i));
                    System.out.println("E-MAIL: " + email.get(i));
                    System.out.println("----------------------------------");
                }
            }
            System.out.print("Deseja listar os contatos novamente? (1 - Sim, 0 - Não): ");
        } while (ler.nextInt() == 1);
        }
        
        // Método para adicionar um contato
        private static void adicionarContato() {
        do {
            System.out.println("------------- ADICIONAR CONTATO -------------");
            System.out.print("NOME: ");
            ler.nextLine(); // Limpa o buffer do Scanner
            String novoNome = ler.nextLine();
            System.out.print("TELEFONE: ");
            String novoTelefone = ler.next();
            System.out.print("EMAIL: ");
            String novoEmail = ler.next();
            nome.add(novoNome);
            telefone.add(novoTelefone);
            email.add(novoEmail);
            System.out.println("CONTATO ADICIONADO COM SUCESSO!");
            System.out.print("Deseja adicionar outro contato? (1 - Sim, 0 - Não): ");
        } while (ler.nextInt() == 1);
        }
        
        // Método para remover um contato
        private static void removerContato() {
        do {
            System.out.println("------------- REMOVER CONTATO -------------");
            if (nome.isEmpty()) {
                System.out.println("A agenda está vazia!");
            } else {
                System.out.println("Escolha o número do contato que deseja remover:");
                for (int i = 0; i < nome.size(); i++) {
                    System.out.println((i + 1) + ". " + nome.get(i));
                }
                int remover;
                remover = ler.nextInt(); 
               
                if (remover >= 1 && remover <= nome.size()) {
                    nome.remove(remover - 1);
                    telefone.remove(remover - 1);
                    email.remove(remover - 1);
                    System.out.println("CONTATO REMOVIDO COM SUCESSO!");
                } else {
                    System.out.println("Número de contato nao existe");
                }
              }
            System.out.print("Deseja remover outro contato? (1 - Sim, 0 - Não): ");
            } while (ler.nextInt() == 1);
        }
        
        // Método para atualizar um contato
        private static void atualizarContato() {
        do {
            System.out.println("------------- ATUALIZAR CONTATO -------------");
        if (nome.isEmpty()) {
            System.out.println("A agenda está vazia!");
        } else {
            System.out.println("Escolha o número do contato que deseja atualizar:");
        for (int i = 0; i < nome.size(); i++) {
            System.out.println((i + 1) + ". " + nome.get(i));
        }
        int att;
        att = ler.nextInt(); // Lê o índice do contato a ser atualizado
        if (att >= 1 && att <= nome.size()) {
            System.out.println("Informe os novos dados do contato:");
            System.out.print("Novo nome: ");
            ler.nextLine(); // Limpa o buffer do Scanner
            String novoNome = ler.nextLine();
            System.out.print("Novo telefone: ");
            String novoTelefone = ler.next();
            System.out.print("Novo email: ");
            String novoEmail = ler.next();
            nome.set(att - 1, novoNome);
            telefone.set(att - 1, novoTelefone);
            email.set(att - 1, novoEmail);
            System.out.println("CONTATO ATUALIZADO COM SUCESSO!");
        } else {
            System.out.println("Número de contato inválido!");
        }
        }
        System.out.print("Deseja atualizar outro contato? (1 - Sim, 0 - Não): ");
        } while (ler.nextInt() == 0);
        }
        }
