package com.company;

import java.util.*;

public class Main {

    static void printElements(Stack<Integer> stack){
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.toArray()[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }

        int[] array = list.stream().mapToInt(i->i).toArray();
        Stack<Integer> stack = new Stack<>();

        stack.push(array[0]);
        int count = 0;

        for(int i = 1; i<array.length;i++){
            if(array[i]>=array[i-1]){
                stack.push(array[i]);
            }else{
                if (stack.size()>1){
                    count++;
                    Collections.reverse(stack);
                    printElements(stack);
                }else{
                    System.out.print(array[i] + " ");
                }
                stack.clear();
                stack.push(array[i]);
            }
        }
        System.out.print(count);
    }
}
