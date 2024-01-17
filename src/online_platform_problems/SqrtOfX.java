package online_platform_problems;

public class SqrtOfX {
    public static void main(String[] args) {

        int num = 111;
        int i = 1;
        int ans  = 1;
        while (ans <= num){
//            ans = i * i ;
            i++;
            ans = i * i;
        }
        System.out.println(i-1);

    }
    
}
