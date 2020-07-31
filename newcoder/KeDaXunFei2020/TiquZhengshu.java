package enplee.algorithms_JAVA.newcoder.KeDaXunFei2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiquZhengshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(solution(s));
        }

    }
    public static String solution(String s){
        StringBuilder sb = new StringBuilder();
        int lab = 1;
        for(char c : s.toCharArray()){
            if(c=='-'&&sb.length()==0) lab = -1;
            if(c>='0' && c<='9') {
                if(c!='0' || sb.length()!=0){
                    sb.append(c);
                }
            }
        }
        String res = sb.toString();
        return lab==-1 ? "-"+res:res;
    }
}
