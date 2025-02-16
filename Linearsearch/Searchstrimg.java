public class Searchstrimg {
    public static void main(String[] args) {
        String han = "JUI";
        char ham = 'I';
     System.err.println(ss(han, ham));
        
    }
    public static boolean  ss(String str , char target){
     if(str.isEmpty()){
       return false;
     }
     for(int i = 0 ; i<= str.length() ; i++){
     if(str.charAt(i) == target){
        return  true;
     }
     }

     return false;
    }
    
}
