package calculator;

import javax.swing.JOptionPane;

public class Calculator {

 
    public static void main(String[] args) {
         int op;
         Suma obj= new Suma();
       op=Integer.parseInt(JOptionPane.showInputDialog(null," Suma 1: \n Resta 2: \n Multiplicación 3: \n División 4: "));
       if(op==1){
           obj.suma(); 
                  
       }
    }
    
}
