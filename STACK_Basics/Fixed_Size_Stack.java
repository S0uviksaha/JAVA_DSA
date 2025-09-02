package STACK_Basics;

import java.util.Scanner;

// Stack using Array

public class Fixed_Size_Stack {
    int arr[];
    int top;
    int size;

    Fixed_Size_Stack(int n){
        arr = new int[n];
        size = n;
        top = -1;
    }

    void push(int x){
        if(top >= size-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
        System.out.println("Inserted element is: "+x);
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = arr[top];
        top--;
        System.out.println("Deleted element is: "+x);
        return x;
    }

    int peek(){
        if(top < 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        System.out.println("Top element is: "+arr[top]);
        return arr[top];
    }

    boolean isEmpty(){
        if(top < 0){
            return true;
        }
        return false;
    }

    void display(){
        if(top < 0){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements are: ");
        for(int i=top; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int length;
        System.out.println("Enter the size of the Stack: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        Fixed_Size_Stack stack = new Fixed_Size_Stack(length);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();

        stack.pop();

        stack.isEmpty();
        stack.display();
    }
}