
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //VARIAVEIS E OBJETOS
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        
        Scanner teclado = new Scanner(System.in);
        String opcoes = "   ---MENU---"
                + "\n1 - Depositar"
                + "\n2 - Sacar"
                + "\n3 - Consultar saldo"
                + "\n4 - Inserir informações do cliente"
                + "\n5 - Consultar Informações"
                + "\n6 - Sair"
                + "\nDigite: ";
  
        //INICIO DO LOOP
        int opc = 1;
        while (opc !=6){
            System.out.print("Escolha uma função: \n"+opcoes);
            opc = Integer.parseInt(teclado.nextLine());
            switch(opc){
                case 1:
                    System.out.println("---DEPOSITAR---");
                    System.out.print("Valor a depositar: ");
                    //deposito
                    double valorDep = Double.parseDouble(teclado.nextLine());
                    conta.depositar(valorDep);
                    //fimDeposito
                    System.out.println("Depósito feito com sucesso\n\nValor depositado: R$ "+valorDep);
                    System.out.println("\nVoltando ao menu...\n");
                    try { Thread.sleep (3000); } catch (InterruptedException ex) {}//Pausa de 3 segundos
                    break;

                case 2:

                    System.out.println("---SACAR---");
                    System.out.print("Valor de saque: ");
                    //saque
                    double valorSaq = Double.parseDouble(teclado.nextLine());
                    conta.sacar(valorSaq);
                    //fimSaque
                    System.out.println("\nVoltando ao menu...\n");
                    try { Thread.sleep (3000); } catch (InterruptedException ex) {}//Pausa de 3 segundos
                    break;   

                case 3:
                    System.out.println("---CONSULTAR SALDO---");
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    System.out.println("\nVoltando ao menu...\n");
                    try { Thread.sleep (3000); } catch (InterruptedException ex) {}//Pausa de 3 segundos
                    break;
                
                case 4:
                    System.out.println("---INFORMAÇÔES DO CLIENTE---");
                    
                    System.out.print("Nome do cliente: ");
                    cliente.nome = teclado.nextLine();
                    
                    System.out.print("Sobrenome do cliente: ");
                    cliente.sobrenome = teclado.nextLine();
                    
                    System.out.print("CPF do cliente: ");
                    cliente.cpf = teclado.nextLine();
                    
                    //PASSANDO AS INFORMAÇÕES PARA A CONTA
                    conta.titular = cliente;
                    System.out.println("---INFORMAÇÕES ATUALIZADAS---");
                    System.out.println("   --Novas informações--");
                    System.out.println("        Nome: " + conta.titular.nome);
                    System.out.println("        Sobrenome: " + conta.titular.sobrenome);
                    System.out.println("        CPF: " + conta.titular.cpf);
                    
                    System.out.println("\nVoltando ao menu...\n");
                    try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                    
                    break;
                case 5:           
                    System.out.println("        ---INFORMAÇÕES DO CLIENTE---");
                    if (conta.titular == null) {
                        System.out.println("Não há informações sobre o cliente. Retornando ao menu...");
                        try { Thread.sleep (3000); } catch (InterruptedException ex) {}//Pausa de 3 segundos
                        break;
                    } else {
                        System.out.println("                Nome: " + conta.titular.nome);
                        System.out.println("                Sobrenome: " + conta.titular.sobrenome);
                        System.out.println("                CPF: " + conta.titular.cpf);
                    }
                    
                    System.out.println("\nVoltando ao menu...\n");
                     try { Thread.sleep (3000); } catch (InterruptedException ex) {}//Pausa de 3 segundos
                    break;
                    
                default:
                    break;
                }
            }
            System.out.println("---FIM DO PROGGRAMA---");
    }
}
