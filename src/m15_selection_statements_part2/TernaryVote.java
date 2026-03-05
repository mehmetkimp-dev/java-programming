package m15_selection_statements_part2;

import java.io.FilterOutputStream;

public class TernaryVote {
    public static void main(String[] args) {

        int age = 28;

        String result = (age >= 18) ? "You are eligibile to vote" : " you are not eligible to vote";
        System.out.println(result);


    }
}
/*  String result;
if (age>=18){
    result= "you are eligible to vote";
}else {
    result= "you are not eligible to vote";

}
*/