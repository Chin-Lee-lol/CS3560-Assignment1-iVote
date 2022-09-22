
class Question { // contains 4 choices of answer, each has a count
    private int A = 0;
    private int B = 0;
    private int C = 0;
    private int D = 0;
    
    public int getA() {return A;}
    
    public void voteA() {A++;}
    
    public void voteB() {B++;}
    
    public int getB() {return B;}
    
    public void voteC() {C++;}
    
    public int getC() {return C;}
    
    public void voteD() {D++;}    
    
    public int getD() {return D;}
    
    public void resetVote() {
	A = 0;
	B = 0;
	C = 0;
	D = 0;
    }
}

class SingleChoice extends Question { // class for single choice vote
    public void SingleVote(char vote)
    {
	if (vote == 'A')
	    voteA();
	else if (vote == 'B')
	    voteB();
	else if (vote == 'C')
	    voteC();
	else
	    voteD();
    } 
}

class MultipleChoice extends SingleChoice { // multiple vote which consist of multiple single vote
    public void MultipleVote(String votes)
    {
	for (int i = 0; i < votes.length(); i++)
	{
	    if (votes.charAt(i) == 'A')
		SingleVote('A');
	    else if (votes.charAt(i) == 'B')
		SingleVote('B');
	    else if (votes.charAt(i) == 'C')
		SingleVote('C');
	    else
		SingleVote('D');
	}
    }
}



