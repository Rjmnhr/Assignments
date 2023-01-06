package questionbank;
import java.util.Scanner;


class Question{
	String prompt;
	String answer;
	Question(String prompt,String answer){
		this.prompt=prompt;
		this.answer=answer;
	}
}


public class Questionbank {

	public static void main(String[] args) {
		String q1= "What is the color of the sky?\na)blue\nb)yellow\nc)red\nd)green"; 
		String q2="What is the color of the apple?\na)blue\nb)yellow\nc)red\nd)orange";
		String q3="what is the color of the water?\na)colorless\nb)red\nc)green\nd)white";
		Question question[]={new Question(q1,"a"),new Question(q2,"c"),new Question(q3,"a")};
		int score=0;
		try {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<question.length;i++) {
			System.out.println(question[i].prompt);
		String	answer=sc.next();
		if(answer.equals(question[i].answer))
			score++;
		}
		System.out.println();
		System.out.println("your Score is=("+score+"/"+question.length+")");		
	
		}
		catch(Exception e) {
			System.out.println("A Exception Occured");
			
		}
	}
		
	}


