package lectone;

public class removethrn {
    public static void main(String[] args) {
        String s = "banana";
        char target = 'a';  // Character to remove

        String result = fun(s, target, 0);
        System.out.println("Result: " + result);

        
    }
    private static String fun(String s , char c , int index){
        if(index == s.length()){
            return "";
        }
        char p  = s.charAt(index);

        String  remain = fun(s, c, index+1);

        if(p == c){
            return remain;

        }else{
            return p+remain;
        }

    }
}
