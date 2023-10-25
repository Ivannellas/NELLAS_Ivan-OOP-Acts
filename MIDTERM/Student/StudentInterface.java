package Student;
import java.util.Scanner;

class StudentInterface{
   public static void main(String a[]){
   
   Scanner sc = new Scanner(System.in);
   Student tone = new Student();
   
   System.out.print("Enter First Name: ");
   tone.setFirstName(sc.nextLine());
   
   System.out.print("Enter Middle Name: ");
   tone.setMiddleName(sc.nextLine());
   
   System.out.print("Enter Last Name: ");
   tone.setLastName(sc.nextLine());
   
   
   System.out.print("Enter Suffix: ");
   tone.setSuffix(sc.nextLine());
   
   
   System.out.println("First Name: " + tone.getFirstName());
   
   System.out.println("Middle Name: " + tone.getMiddleName());
   
   System.out.println("Last Name: " + tone.getLastName());
   
   System.out.println("Suffix : " + tone.getSuffix());
   
   System.out.println("Full Name: "+ tone.getFullName());
   
   
   
   }
}