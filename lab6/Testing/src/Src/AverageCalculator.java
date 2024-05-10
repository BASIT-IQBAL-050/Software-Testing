/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

/**
 *
 * @author BASIT
 */
public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println(average);
    }
}