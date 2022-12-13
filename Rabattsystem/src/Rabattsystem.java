import java.util.Scanner;
public class Rabattsystem {

   public static void main(String[] args) {
      Scanner Tastatur = new Scanner(System.in);

      
     double x = 0;
     
     
     //Eingabe
     System.out.print("Bitte Geben sie ihren Bestellwert ein");
     x = Tastatur.nextInt();
     if (x > 100 && x > 0) {
    	 x  = x - (x * 0.9);
    	 System.out.print(x);
     }
     else if (x > 500 && x > 100) {
    	 x  = x - (x * 0.20);
     }
      
	 System.out.println ("Der Bestellwert abzüglich Rabatt beträgt: " + x);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}