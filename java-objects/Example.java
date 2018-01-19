public class Example{
    public static void main(String[] args){
        PezDispenser dispenser = new PezDispenser("Luke");
        dispenser.Fill(8);
        
        while(dispenser.Dispense()){
            System.out.println("Chomp");
        }
        if(dispenser.IsEmpty()){
            System.out.println("Out");
        }
        try{
        dispenser.Fill(13);
        }catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println(dispenser.GetCharacterName());
    }
}