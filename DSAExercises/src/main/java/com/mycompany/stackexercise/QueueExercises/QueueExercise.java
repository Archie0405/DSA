/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackexercise.QueueExercises;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Nichie
 */


public class QueueExercise {
    public static void main(String[] args) {

        Queue<String> tasks = new LinkedList<>();

        // Add tasks to the queue
        tasks.add("Generate payroll report");
        tasks.add("Email HR updates");
        tasks.add("Backup employee records");
        tasks.add("Update attendance logs");

        System.out.println("Starting task execution...\n");

        // Process tasks in FIFO order
        while (!tasks.isEmpty()) {
            String currentTask = tasks.remove();
            System.out.println("Executing: " + currentTask);
        }

        System.out.println("\nAll tasks completed.");
    }

}
