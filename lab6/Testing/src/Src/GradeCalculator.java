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
public class GradeCalculator {

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        if (score >= 90) {
            return
 
"A";
        } else
 
if (score >= 80) {
            return
 
"B";
        } else
 
if (score >= 70) {
            return
 
"C";
        } else
 
if (score >= 60) {
            return
 
"D";
        } else {
            return
 
"F";
        }
    }

    public static void main(String[] args) {
        int score = 85;
        String grade = calculateGrade(score);
        System.out.println(grade);
    }
}
