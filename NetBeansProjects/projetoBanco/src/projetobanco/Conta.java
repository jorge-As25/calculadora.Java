
package projetobanco;


public class Conta {
    String nome;
    double saldo;

    
    public void depositar(double valor){
        
        saldo += valor;
        System.out.println("operação de deposito no valor de R$: " + valor);
    }
    
    
    public void exibir(){
        System.out.println(nome + " seu saldo é de R$" + saldo);
    }
    
    
    
      public void sacar(double valor){
        
        saldo -= valor;
 
        if(saldo>valor){
            saldo -= valor;
            System.out.println("operação de saque no valor de R$: " + valor);
        }else{
            System.out.println("saldo insuficiente ");
            System.out.println("seu saldo é " + saldo +" saque de R$ " + valor);
        }
        saldo -= valor; 
          System.out.println(" operação de saque no valor de R$ "+ valor);
        
    }
    
}
