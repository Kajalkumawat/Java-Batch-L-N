// import java.util.*;

// public class Link {
// public static void main(String[] args) {
// // add two linked list
// LinkedList<Integer> al1 = new LinkedList<>();
// al1.add(1);
// al1.add(2);
// al1.add(3);
// al1.add(4);
// System.out.println("al1 " + al1);
// LinkedList<Integer> al2 = new LinkedList<>();
// al2.add(12);
// al2.add(34);
// al2.add(89);
// al2.add(67);
// System.out.println("al2" + al2);
// // add al1 and al2
// al1.addAll(2,al2);
// System.out.println(al1);
// }
// }
// arraylist user input :
// import java.util.*;
// public class Link {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter size");
// int size = sc.nextInt();
// ArrayList<Integer> al = new ArrayList<>();
// for (int i = 0; i < size; i++) {
// System.out.println("enter value");
// int x = sc.nextInt();
// al.add(x);
// }
// for (int i = 0; i < al.size(); i++) {
// System.out.print(al.get(i) + " ");
// }
// }
// }
// -------------------------------------------------------
// add every even number in arraylist :

// import java.util.*;
// public class Link {
// public static void main(String[] args) {
// int sum = 0;
// // 1538,879
// ArrayList<Integer> al = new ArrayList<>();
// al.add(1234);
// al.add(5643);
// al.add(567567);
// for (int i = 0; i < al.size(); i++) {
// sum = 0;
// int temp = al.get(i);
// while (temp > 0) {
// int rem = temp % 10;
// if (rem % 2 == 0) {
// sum = sum + rem;
// }
// temp = temp / 10;
// }
// System.out.println(sum);
// System.out.println();
// }
// }
// }
// --------------------------------------------------------------------
// import java.util.*;
// public class Link {
// public static void main(String[] args) {
// LinkedList<Integer> al = new LinkedList<>();
// al.add(234);
// al.add(67);
// al.add(12);
// al.add(89);
// Collections.sort(al);
// System.out.println(al);
// }
// }
// --------------------------------------------------------------------
// import java.util.*;

// public class Link {
// public static void main(String[] args) {
// // add two linked list
// LinkedList<Integer> al1 = new LinkedList<>();
// al1.add(1);
// al1.add(2);
// al1.add(3);
// al1.add(4);
// System.out.println("al1 " + al1);
// LinkedList<Integer> al2 = new LinkedList<>();
// al2.add(12);
// al2.add(34);
// al2.add(89);
// al2.add(67);
// System.out.println("al2" + al2);
// // add al1 and al2
// al1.addAll(al2);
// System.out.println(al1);
// }
// }
// --------------------------------------------------------------
