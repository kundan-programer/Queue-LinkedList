
// Queue through LinkedList --> Source Code
import java.util.Scanner;

class Queue2 {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node F = null;
  Node R = null;

  public void enqueue(Scanner sc) {

    System.out.print("Enter Data: ");
    int data = sc.nextInt();
    Node ob = new Node(data);

    if (F == null && R == null) {
      F = ob;
      R = ob;
    }

    else {
      R.next = ob;
      R = ob;
    }

  }

  public void Dequeue() {
    if (F == null) {
      System.out.println("Underflow");
    }

    else {
      F = F.next;
      System.out.println("Delete SucessFull");
    }
  }

  public void display() {
    Node temp = F;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

  }
}

public class Queue_LL {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue2 s = new Queue2();
    int l;
    do {

      System.out.println("Press 1 to Enqueuq: ");
      System.out.println("Press 2 to Dequeue: ");
      System.out.println("Press 3 to display: ");
      System.out.println();
      System.out.print("Enter your chice: ");
      int c = sc.nextInt();

      switch (c) {
        case 1:
          s.enqueue(sc);
          break;

        case 2:
          s.Dequeue();
          break;

        case 3:
          s.display();
          break;

        default:
          System.out.println("Invalid choice");
          break;
      }
      System.out.print("\nEnter 0 to go back to the main menu: ");
      l = sc.nextInt();
      System.out.println();
    }

    while (l == 0);
    System.out.print("Exit sucessfully");
  }
}
