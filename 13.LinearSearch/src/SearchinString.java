import java.util.Arrays;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Jayani";
        boolean result = isChar2(name,'a');

        System.out.println(result);

    }
    static boolean isChar2(String arr,char target){

        if(arr.length() == 0){
            return false;
        }
        for(char c : arr.toCharArray()){
            if(c == target){
                return true;
            }


        }
return false;

    }

    static boolean isChar(String arr,char ch){

        if(arr.length() == 0){
            return false;
        }


        for (int index = 0; index < arr.length(); index++) {

            char element = arr.charAt(index);
            if(element == ch){
                return true;
            }

        }
        return false;
    }
}
