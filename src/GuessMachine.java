public class GuessMachine {
    private int number;
    private int numguesses;
    private int guess;
    
    public GuessMachine(){
        number=(int)(Math.random()*100)+1;
        guess=0;
        numguesses=0;
    }
    public String giveHint(){
        if(guess>number){
           return "You guessed too High guess lower ";
          }
        else{
            return "You guessed too low guess higher";
        }
    }
    
    public int getNumbguesses(){
        if(guess<number || guess>number){
            numguesses++;
            
        }
        
    }
//to do -add methods:
    //giveHint(),setGuess(),getNumGuesses()
}
