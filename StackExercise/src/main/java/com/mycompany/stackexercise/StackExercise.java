/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackexercise;

/**
 *
 * @author Nichie
 */

import java.util.Stack;
        
public class StackExercise {
    
    // Method to check if pop sequence is valid for a given push sequence
    public static boolean isValidPopSequence(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;

        for (int num : pushed) {
            stack.push(num);

            // Check if the top of the stack matches the next number to pop
            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }

    
    public static void main(String[] args) {
        int[] pushed1 = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 5, 3, 2, 1}; // valid

        int[] pushed2 = {1, 2, 3, 4, 5};
        int[] popped2 = {4, 3, 5, 1, 2}; // invalid

        System.out.println(isValidPopSequence(pushed1, popped1)); // true
        System.out.println(isValidPopSequence(pushed2, popped2)); // false
    }
}
