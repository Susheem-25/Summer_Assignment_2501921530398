import java.util.*;
public class Q2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] empId=new int[100];
String[] empName=new String[100];
String[] empDept=new String[100];
int count=0;
while(true){
System.out.print("1.Add 2.View 3.Exit: ");
int ch=sc.nextInt();
if(ch==1){
System.out.print("ID: ");
empId[count]=sc.nextInt();
sc.nextLine();
System.out.print("Name: ");
empName[count]=sc.nextLine();
System.out.print("Dept: ");
empDept[count]=sc.nextLine();
count++;
}else if(ch==2){
for(int i=0;i<count;i++) System.out.println("ID: "+empId[i]+" | Name: "+empName[i]+" | Dept: "+empDept[i]);
}else if(ch==3) break;
}
sc.close();
}
}