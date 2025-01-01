

public class Assignment8 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Error. No integer values provided.");
            return ;
        }
        int max = Integer.MIN_VALUE;
        boolean validInput = false;
        for(String arg : args){
            if(isInteger(arg)){
                int number = Integer.parseInt(arg);
                if(number>max){
                    max = number;
                }
                validInput = true;
            }else{
                System.out.println("Warning:" + arg + "is not a valid integer and will be ignored.");
            }
        }
        if(validInput){
            System.out.println("The largest value is:" + max);
        }else{
            System.out.println("Error. No valid integer values provided.");
        }
    }
    public static boolean isInteger(String str){
        if(str == null || str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if( i==0 && c=='-'){
                if(str.length()==1){
                    return false;
                    
                }
                continue;
            }
            if(!Character.isDigit(c)){
            return false;
        }
    }
    return true;
}
}
