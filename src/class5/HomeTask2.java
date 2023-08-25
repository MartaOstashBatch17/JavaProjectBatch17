package class5;

import java.util.Scanner;

public class HomeTask2 {/*

Write a program that will read three inputs of scores (quiz, mid term, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F

*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the quiz score 1-100");
        int quizScore= input.nextInt();
        System.out.println("Please, enter mid term score 1-100");
        int midTermScore=input.nextInt();
        System.out.println("Please, enter your final score");
        int finalScore=input.nextInt();

        int averageScore=(quizScore+midTermScore+finalScore)/3;

        if (averageScore>=90){
            System.out.println("Grade is A");
        }else if(averageScore>=70 &&averageScore<90){
            System.out.println("Grade is B");
        } else if (averageScore>=50 && averageScore<70) {
            System.out.println("Grade is C");
        }else if (averageScore<50){
            System.out.println("Grade is F");
        }


    }
}