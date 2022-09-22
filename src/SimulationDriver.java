import java.util.Random;
import java.util.ArrayList;

class SimulationDriver {
    
    private Random r = new Random();
    ArrayList<Integer> Qlist = new ArrayList<Integer>();
    ArrayList<Student> Slist = new ArrayList<Student>();
    iVote V = new iVote();
    MultipleChoice Q = new MultipleChoice();
    
    public void SimulateQuestion(int n) // random question to be single or multiple choice
    {
	for (int i = 0; i < n; i++)
	{
	    int rand = r.nextInt(2) + 1;
	    Qlist.add(rand);
	    System.out.print("Q" + (i+1) + " is a ");
	    if (rand == 1)
		System.out.print("Single Choice question\n");
	    else
		System.out.print("Multiple Choice question\n");
	}
    }
    
    public void SimulateStudent(int n) // random student id
    {
	for (int i = 0; i < n; i++)
	{
	    Student s = new Student();
	    int rand = r.nextInt(10000) + 10000; // lets assume that 1/10000 will be no dupes
	    s.setID(rand);
	    Slist.add(s);
	    System.out.println("Student " + (i+1) + " id: " + rand);
	}
    }
    
    public void SimulateAnswer()
    {
	for (int i = 0; i < Qlist.size(); i++)	
	{
	    for(int j = 0; j < Slist.size(); j++)
	    {
		if(Qlist.get(i) == 1) // question is single choice
		{
		    int rand = r.nextInt(4);
		    if (rand == 0)
			V.SingleVoting('A', Q);
		    else if (rand == 1)
			V.SingleVoting('B', Q);
		    else if (rand == 2)
			V.SingleVoting('C', Q);
		    else
			V.SingleVoting('D', Q);
		}
		else
		{
		    String ans = ""; // simply RNG the vote for multiple choice with 50/50 chance of select rate
		    int rand = r.nextInt(2);
		    if(rand == 1)
			ans += "A";
		    rand = r.nextInt(2);
		    if(rand == 1)
			ans += "B";
		    rand = r.nextInt(2);
		    if(rand == 1)
			ans += "C";
		    rand = r.nextInt(2);
		    if(rand == 1)
			ans += "D";
		    V.MultipleVoting(ans, Q);    
		}
	    }
	    V.NextQuestion(Q); // move to next question
	}
    }
    
    public void print() // is print, very cool
    {
	V.print();
    }
}
