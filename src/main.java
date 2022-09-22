import java.util.Scanner;
public class main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter number of question: ");
	int q = scan.nextInt();
	System.out.print("Please enter number of student: ");
	int s = scan.nextInt();
	SimulationDriver D = new SimulationDriver();
	D.SimulateQuestion(q);
	D.SimulateStudent(s);
	D.SimulateAnswer();
	D.print();

    }

}
