
package jorge.metodos;

public class Calculadora {

    int valor1 = 10;
    int valor2 = 10;

    void adicao() {

        int resultado = valor1 + valor2;
        System.out.println("O valor da soma é:" +resultado);
        
    }
    
    void subtracao(){
        
        int resultado = valor1 -valor2;
        System.out.println("O valor da subtração é: "+ resultado);
    
    }
    
    void multiplicacao(){
    int resultado = valor1 * valor2;
        System.out.println("O valor da multiplicacao é de: "+ resultado);
    }
    
    void divisao(){
    int resultado = valor1 / valor2;
        System.out.println("O valor da divisao é de: "+ resultado);
    }
}
