package sorting;

public class DefangingIpAddress {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.charAt(1));

        String addr = "1.1.1.1";
        System.out.println(defangingIpAdd(addr));
    }

    static String defangingIpAdd(String address){
        int index = 0;
        String ans = "";
        while (index < address.length()){
            if (address.charAt(index) == '.'){
                ans = ans + "[.]";
            }
            else
                ans = ans + address.charAt(index);
            index++;
        }
        return ans;
    }
}
