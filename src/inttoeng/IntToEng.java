package inttoeng;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] number={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] number10={"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","ninety "};
    	String number100=" hundred and ";
    	StringBuilder sb = new StringBuilder();
    	
    	if(n==0) return "zero";
    	
    	int n100=n/100;
    	int n10=(n-(n100*100))/10;
    	int n1;
    	if(n100>=1 && (n%100)==0){
    		sb.append(number[n100]);
    		sb.append(number100);
    	}
    	if(n10>1){
    		n1=n%10;
    	}else{
    		n1=n;
    	}
    	
    	sb.append(number10[n10]);
    	sb.append(number[n1]);
    	return new String(sb);
    }
}