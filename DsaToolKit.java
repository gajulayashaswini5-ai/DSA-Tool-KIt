import java.util.Scanner;
public class DsaToolKit {
    static Scanner sc = new Scanner(System.in);
    static int[] stack=new int[5];
    static int top=-1;
    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    //----BINARY SEARCH---
    public static void binarySearch() { 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
       }

       if (!found) {
            System.out.println("Element not found!");
        }
    }
    
    //----BUBBLE SORT---
    static void bubbleSort() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("SOrted Array: ");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println();
    }

    //---stack using arrays
    static void stackMenu() {
        while (true) {
        System.out.println("\n--- STACK MENU ---");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("0. Back");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                displayStack();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice!");
           }
       }
   }
    //Queue using array
    static void queueMenu() {
        while (true) {
        System.out.println("\n--- QUEUE MENU ---");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("0. Back");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                displayQueue();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
    
    static void stringReverse() {
        sc.nextLine();
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);

        }
        System.out.println("Reversed String : "+reversed);
    }
    static void palindromeCheck() {
        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
    static void push() {
        if (top == stack.length - 1) {
           System.out.println("Stack Overflow!");
           return;
        }
        System.out.print("Enter element to push: ");
        int value = sc.nextInt();
        stack[++top] = value;
        System.out.println("Pushed successfully.");
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println("Popped element: " + stack[top--]);
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    static void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    static void enqueue() {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        System.out.print("Enter element to enqueue: ");
        int value = sc.nextInt();
        queue[++rear] = value;
        System.out.println("Enqueued successfully.");
    }

    static void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println("Dequeued element: " + queue[front++]);
    }

    static void displayQueue() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- DSA TOOLKIT ---");
            System.out.println("1. Binary Search");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Stack using Array");
            System.out.println("4. Queue using Array");
            System.out.println("5. String Reverse");
            System.out.println("6. Palindrome Check");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    binarySearch();
                    break;
                case 2:
                    bubbleSort();
                    break;
                case 3:
                    stackMenu();
                    break;
                case 4:
                    queueMenu();
                    break;
                case 5:
                    stringReverse();
                    break;
                case 6:
                    palindromeCheck();
                    break;
                case 0:
                    System.out.println("Exiting DSA Toolkit...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    
}

