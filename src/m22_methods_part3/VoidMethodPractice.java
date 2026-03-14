package m22_methods_part3;

public class VoidMethodPractice {
    public static void main(String[] args) {

        displayGrade(100);


    }
    public static void displayGrade(int score) {
     if (score <0 || score>100) {
         System.err.println("Invalid score: " + score);
         return;
     }
         if (score >= 90) {
             System.out.println("Excellent, You made an A");
         } else if (score >= 80) {
             System.out.println("Great, You made a B");
         } else if (score >= 70) {
             System.out.println("Good, You made a C");
         } else if (score >= 60) {
             System.out.println("Passed, You made a D");
         } else {
             System.out.println("failed, You made an F");
         }
     }




}
/*
Create a method named displayGrade that passes an int parameter named score
and displays the grade of the student.

    Example1:
        displayGrade(95);

      Output:
           Excellent, You made an A
 */