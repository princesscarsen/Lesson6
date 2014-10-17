public class GuessMachine {
    private int number;
    private int numguesses;
    private int guess;
    
    public GuessMachine(){
        number=(int)(Math.random()*100)+1;
        //generates random number
        guess=0;
        numguesses=0;
    }
    //gives user hints 
    public String giveHint(){
        if(guess>number){
           return "You guessed too High guess lower ";
           //if guess was high
          }
        else if (guess<number){
            return "You guessed too low guess higher";
            //if guess was low
        }
        else 
            return "You got it!";
        //when you get the correct number
    }
    
    //keeps track of the guesses
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
