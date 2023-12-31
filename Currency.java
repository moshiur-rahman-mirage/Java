
import java.util.*;
import java.text.*;


public class Currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat uscur=NumberFormat.getCurrencyInstance(Locale.US);
        String us = uscur.format(payment);
        
        Locale inLocale=new Locale("en","in");
        NumberFormat incur=NumberFormat.getCurrencyInstance(inLocale);
        String india = incur.format(payment);
        
      
        NumberFormat cncur=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cncur.format(payment);
        
     
        NumberFormat fCur=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fCur.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: RS." + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}