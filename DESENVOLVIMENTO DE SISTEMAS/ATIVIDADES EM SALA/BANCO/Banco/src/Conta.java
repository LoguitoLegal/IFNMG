public class Conta {
    //declarando as variáveis :O
    int numeroConta;
    Cliente titular;
    double saldo;
    
    Conta depositar(double valorDeDeposito){
        
        this.saldo += valorDeDeposito;//Pega o saldo atual (inicalmente 0), soma ele mais o valor que a pessoa quer depositar (valorDeDeposito)
        
         return this;
    }
    
    double consultarSaldo() {
        return saldo; //Retorna o saldo atual :O
    }
    
    boolean sacar (double sacarDinheiro){
        
        if ((this.saldo - sacarDinheiro) < 0) { //Pega o saldo atual e subtrai pelo valor que a pessoa quer sacar. Após, verifica se o valor dessa conta é menor que 0
            
            //Se o valor for menor que 0, vai printar isso tudo aqui
            System.out.println("\n---Não foi possível sacar---\n");
            System.out.println("OPERAÇÃO INVÁLIDA: Valor de saque maior que o saldo atual");
            System.out.println("Saldo atual: R$ " + saldo + "\nValor desejado de saque: R$ " + sacarDinheiro);
            System.out.println("Diferença: R$ " + (sacarDinheiro - this.saldo) + "\n");
        } 
        
        else if (sacarDinheiro < 0) {
            
            System.out.println("\n---Não foi possível sacar---\n");
            System.out.println("Não é possível sacar valores negativos");
        }
        
        else {
            
            this.saldo -= sacarDinheiro;//Pega o saldo atual e subtrai ele (saldo) pelo dinheiro que deseja sacar (sacarDinheir
        
        }
        return true;
    }
    
    boolean transferir(Conta destino, double valor){
        if (! this.sacar(valor)){
            
            return false;
        } else {
            
            destino.depositar(valor);
            System.out.println("Transferência concluida\n");
            return true;
        }
    } //PODE SER UTILIZADA POSTERIORMENTE
    
}

