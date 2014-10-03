import TerminalIO.*;
public class MakeEmployees {

    
    public static void main(String[] args) {
        KeyboardReader k=new KeyboardReader();
        Employee emp; //employee
        String name; //name
        int type; //type
        double rate; //hourly pay rate
        int hours; //hours worked
        String prompt; //user prompt
        emp=new Employee();
        while (true){
            //get the name and break if blank
            System.out.println("Enter employee data");
            name=k.readLine(" Name (or <enter> to quit): ");
            if(!(emp.setName(name)))break;
            //get the type until valid
            while(true) {
                prompt=" Type ("+emp.getTypeRules()+"): ";
                type=k.readInt(prompt);
                if (emp.setType(type))break;
            }
            //Get hourly pay rate until valid
            while(true){
                prompt= "Hourly rate("+emp.getRateRules()+"): ";
                rate=k.readDouble(prompt);
                if(emp.setRate(rate))break;
            }
            //get the hours worked until valid
            while(true){
                prompt=" Hours("+emp.getHourRules()+"): ";
                hours=k.readInt(prompt);
                if(emp.setHours(hours))break;
            }
            //print the name and pay
            System.out.println(" The Weekly pay for ");
            System.out.println(emp.getName());
            System.out.println(" is $"+emp.getPay());
        }
    }
    
}
