import java.util.Scanner;

/* This exercise from hackerrank.com checks an input string to see if it is a valid IP address. True will be printed if it is, false will
be printed if it is invalid.
*/

public class Main {
}

    class Solution{

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

    class MyRegex{

        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
    }

