package com.codewars.eightkyu;
/*It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?
Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.
If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.
Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3"*/

public class DoIGetABonus {
    public static String bonusTime(final int salary, final boolean bonus) {
        int x;
        if (bonus) {
            x = salary * 10;
        } else {
            x = salary;
        }
        return "\u00A3" + x;

        //sprytniejszy zapis
        //return "\u00A3" + (bonus ? 10 : 1) * salary;


    }

//    public static void main(String[] args) {
//        System.out.println(2 == 3 ? "True" : 2 == 2 ? "True 2" : "False");
//    }
}
