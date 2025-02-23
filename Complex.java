import java.util.Scanner;
public class Complex{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the real part of 1st complex no:");
        int real1 = scanner.nextInt();
        System.out.print("Enter the  imaginary part of 2nd complex no: ");
        int imaginary1 = scanner.nextInt();
        System.out.print("Enter the  real part of 2nd complex no:");
        int real2 = scanner.nextInt();
        System.out.print("Enter the imaginary part of 2nd complex no: ");
        int imaginary2 = scanner.nextInt();
        int realsum=real1+real2;
        int imaginarysum=imaginary1+imaginary2;
        System.out.print("The 1st complex number is:" +real1+ "+" +imaginary1+"i\n");
        System.out.print("The 1st complex number is:" +real2+ "+" +imaginary2+"i\n");
         System.out.print("The sum of complex numbers is:" +realsum+ "+" +imaginarysum +"i");
         }
         }
        
        
        
        
        
        

        
        
