import java.util.ArrayList;

class iVote {
    
    private ArrayList<int[]> Ansvotes = new ArrayList<int[]>(); // list for votes count
   
    public void SingleVoting(char ans, MultipleChoice Q) // simply calls its function
    {
	Q.SingleVote(ans);

    }
    
    public void MultipleVoting(String ans, MultipleChoice Q)
    {
	Q.MultipleVote(ans);	
    }
    
    public void NextQuestion(MultipleChoice Q)
    {	
	int[] votes = {Q.getA(),Q.getB(),Q.getC(),Q.getD()}; // get vote counts from Qustion
	Ansvotes.add(votes); // add to the list
	Q.resetVote(); // reset vote count
    }
    
    public void print()
    {
	System.out.println("Answer counts"); // printing stuff
	for (int i = 0; i < Ansvotes.size(); i++)	
	    System.out.println("Question " + (i+1) + " -> A: " + Ansvotes.get(i)[0] + " B: " + Ansvotes.get(i)[1]
	    + " C: " + Ansvotes.get(i)[2] + " D: " + Ansvotes.get(i)[3]);	
    }
}
