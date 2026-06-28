import java.util.*;
class Q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> books = new ArrayList<>();
while(true) {
System.out.println("1.Add Book 2.View Books 3.Borrow Book 4.Exit");
int ch = sc.nextInt();
sc.nextLine();
if(ch == 1) {
System.out.println("Enter book name:");
books.add(sc.nextLine());
} else if(ch == 2) {
for(String b : books) System.out.println(b);
} else if(ch == 3) {
System.out.println("Enter book to borrow:");
String b = sc.nextLine();
if(books.contains(b)) {
books.remove(b);
System.out.println("Borrowed");
} else {
System.out.println("Not found");
}
} else if(ch == 4) {
break;
}
}
sc.close();
}
}