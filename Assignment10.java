import java.util.Scanner;

public class NoMatchFoundException extends Exception{
    public NoMatchFoundException(String message){
        super(message);
    }
}
class Assignment10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
           try{
                if("University".equals(input)){
                System.out.println("Match Found.");
            }else{
                throw new NoMatchFoundException("No match found for the input string:"+input);
            }
        }catch(NoMatchFoundException e){
            System.out.println("Exception caught:"+e.getMessage());
    }finally{
        sc.close();
        }
    }
}
