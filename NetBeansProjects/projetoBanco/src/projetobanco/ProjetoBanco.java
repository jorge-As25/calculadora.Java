
package projetobanco;

import javax.swing.JOptionPane;

public class ProjetoBanco {

 
    public static void main(String[] args) {
      Conta conta = new Conta();
      
      conta.nome = JOptionPane.showInputDialog("Digite o seu nome");
      conta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo"));
   
      conta.exibir();
              
      conta.depositar(50);
      
      conta.exibir();
      
      conta.sacar(200);
      
      
    }
    
}
