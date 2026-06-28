import java.util.*;
class Q3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean[] seats = new boolean[10];
while(true) {
System.out.println("1.View Seats 2.Book Seat 3.Exit");
int ch = sc.nextInt();
if(ch == 1) {
for(int i=0; i<seats.length; i++) {
System.out.print("Seat " + i + ":" + (seats[i] ? "Booked" : "Free") + "  ");
}
System.out.println();
} else if(ch == 2) {
System.out.println("Enter seat number (0-9):");
int s = sc.nextInt();
if(s >= 0 && s < 10 && !seats[s]) {
seats[s] = true;
System.out.println("Booked successfully");
} else {
System.out.println("Invalid or already booked");
}
} else if(ch == 3) {
break;
}
}
sc.close();
}
}