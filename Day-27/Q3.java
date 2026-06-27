import java.util.*;
public class Q3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] id=new int[100];
double[] salary=new double[100];
int count=0;
while(true){
System.out.print("1.Add 2.View 3.Exit: ");
int ch=sc.nextInt();
if(ch==1){
System.out.print("ID: ");
id[count]=sc.nextInt();
System.out.print("Basic: ");
double basic=sc.nextDouble();
System.out.print("HRA: ");
double hra=sc.nextDouble();
System.out.print("DA: ");
double da=sc.nextDouble();
salary[count]=basic+hra+da;
count++;
}else if(ch==2){
for(int i=0;i<count;i++) System.out.println("ID: "+id[i]+" | Total Salary: "+salary[i]);
}else if(ch==3) break;
}
sc.close();
}
}