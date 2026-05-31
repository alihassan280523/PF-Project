import Packages.Windows.*;

public class Main{
    public static void main(String[] args){

        StudentSignUp obj=new StudentSignUp();
        System.out.println("Hello");

        
        if(obj.getStatus()){
            System.out.println("Hello");
            new LogInWindow();
        }
    }
}