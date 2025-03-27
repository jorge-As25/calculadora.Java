
package ex;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class calc {
    
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        
        double a,b,res;
        double op;
        
        System.out.println("primeiro numero ");
        a = parseDouble(conta.next());
        
        System.out.println("operador "+
                "1_soma "+
                "2_menos "+
                "3_div "+
                "4_multi ");
        op = parseDouble(conta.next());
        
        System.out.print("segundo numero ");
        b = parseDouble(conta.next());
        
        if(op == 1){
            res = a + b;
            System.out.print(res);
        }
        else if(op == 2){
            res = a - b;
            System.out.print(res);
        }
        else if(op == 3){
            res = a / b;
            System.out.print(res);
        }
         else  if(op == 4){
            res = a * b;
            System.out.print(res);
        }else{
             System.out.println("erro");
         }
    }
    

}

    

