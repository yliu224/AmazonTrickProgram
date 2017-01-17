import java.util.Scanner;

/**
 * Created by dean on 1/14/2017.
 */
public class mainApp {
    public static void main(String args[]){
        String output;
        String strIn;

        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter the question strings");
            strIn = in.nextLine();
            if(strIn.equals("Exit")) return;
            for(String s:strIn.split(",")){
                System.out.println(printNo(s));
            }

            System.out.println("Enter the answer");
            output = in.nextLine();
            System.out.println(printStr(output));
            System.out.println();
        }

    }
    public static String printNo(String str){
        str=str.toUpperCase();
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c>='A'&&c<='Z'){
                if(sb.length()>0&&sb.charAt(sb.length()-1)!='\t'){
                    sb.append('\t');
                }
                sb.append((c-'A'+1)+"\t");
            }
            else
                sb.append(c+"\t");
        }
        return sb.toString();
    }
    public static String printStr(String str){
        if(str.equals("")) return "";
        StringBuilder sb=new StringBuilder();
        for(String s:str.split(",")){
            int n=Integer.valueOf(s)-1;
            if(n>=26) n=n-26;
            sb.append((char)(n+'A'));
        }
        return sb.toString();
    }
}
