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
        else if (guess<number){
            return "You guessed too low guess higher";
        }
        else 
            return "You got it!";
    }
    
    
    public boolean setGuess(int g){
     if(g>=1&&g<=100){
        numguesses++;
        guess=g;
        return true;
    }else
        return false;
    }
    
    public int getNumbguesses(){
        return numguesses;
        
    }
}
