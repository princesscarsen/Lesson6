import TerminalIO.*;
public class MakeEmployees {

    
    public static void main(String[] args) {
        KeyboardReader k=new KeyboardReader();
        String name=k.readLine("Enter Your Name: ");
        System.out.println("Hello " +name);
        System.out.println("This is another line");
    }
    
}
