import java.util.*;
public class Q1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] id=new int[100];
String[] name=new String[100];
int count=0;
while(true){
System.out.print("1.Add 2.View 3.Exit: ");
int ch=sc.nextInt();
if(ch==1){
System.out.print("ID: ");
id[count]=sc.nextInt();
sc.nextLine();
System.out.print("Name: ");
name[count]=sc.nextLine();
count++;
}else if(ch==2){
for(int i=0;i<count;i++) System.out.println("ID: "+id[i]+" | Name: "+name[i]);
}else if(ch==3) break;
}
sc.close();
}
}