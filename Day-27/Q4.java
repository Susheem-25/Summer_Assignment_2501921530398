import java.util.Scanner;
public class Q4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("RollNo: ");
int roll=sc.nextInt();
sc.nextLine();
System.out.print("Name: ");
String name=sc.nextLine();
System.out.print("Subject 1 Marks: ");
int m1=sc.nextInt();
System.out.print("Subject 2 Marks: ");
int m2=sc.nextInt();
System.out.print("Subject 3 Marks: ");
int m3=sc.nextInt();
int total=m1+m2+m3;
double per=total/3.0;
String grade=per>=90?"A":per>=75?"B":per>=50?"C":"F";
System.out.println("--- MARKSHEET ---");
System.out.println("RollNo: "+roll+" | Name: "+name);
System.out.println("Total: "+total+"/300 | Percentage: "+per+"% | Grade: "+grade);
}
}