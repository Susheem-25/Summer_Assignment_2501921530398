import java.util.*;
class Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> names = new ArrayList<>();
ArrayList<String> phones = new ArrayList<>();
while(true) {
System.out.println("1.Add Contact 2.View Contacts 3.Exit");
int ch = sc.nextInt();
sc.nextLine();
if(ch == 1) {
System.out.println("Enter Name:");
names.add(sc.nextLine());
System.out.println("Enter Phone:");
phones.add(sc.nextLine());
} else if(ch == 2) {
for(int i=0; i<names.size(); i++) {
System.out.println(names.get(i) + " : " + phones.get(i));
}
} else if(ch == 3) {
break;
}
}
sc.close();
}
}