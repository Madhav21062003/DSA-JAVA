package loops;

public class DecimalToOctal {
    public static void main(String[] args) {

        int num =33, ans = 0, rem , mul =1;

        while (num > 0){
            rem = num % 8;
            num = num / 8;
            ans = rem * mul + ans;
            mul = mul * 10;
        }
        System.out.println(ans);
    }
}
