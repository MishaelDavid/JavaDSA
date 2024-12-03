import java.util.*;
public class StringReversal {
    public static void main(String[] args) {
        String str = "heelo";
        char[] c =str.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){                  //using two pointers at 2 ends and swapping
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        str= new String(c);
        System.out.println(str);
    }
}

