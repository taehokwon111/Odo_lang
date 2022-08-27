package Odo;

import java.util.StringTokenizer;


public class test {

    public static void main(String[] args) {
        String str = "1234?56!!!7..8";
        StringTokenizer st = new StringTokenizer(str);

        int i = 0;
        while(st.hasMoreTokens()){
                // if (st.nextToken() == '!') {
                    
                // }
                System.out.println(str.charAt(i));
                i++;
        }
    }
}