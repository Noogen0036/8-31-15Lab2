import java.util.Scanner;

public class Prog1 {
	/*
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int hours, minutes, seconds, totalHours, totalMinutes, totalSeconds; 
		double pace, miles, minPace, secPace, marathon,hmarathon,mmarathon,smarathon, tenk, h10k,m10k,s10k;
		String name; 
		System.out.println("What is your first name?");
		name = in.nextLine();
		System.out.println("How many miles did you run today?");
		miles = in.nextDouble();
		System.out.println("How many hours did it take?");
		hours = in.nextInt();
		System.out.println("How many minutes did it take?");
		minutes = in.nextInt();
		System.out.println("How many seconds did it take?");
		seconds = in.nextInt();
		
		totalHours = hours * 3600;
		totalMinutes = minutes * 60;
		totalSeconds = seconds + totalMinutes + totalHours;
		pace = (totalSeconds/miles);
		minPace = (int)pace/60;
		secPace = (int)pace%60;
		
		//marathon
		marathon = pace*26.2;
		hmarathon = (int)(marathon/3600);
		mmarathon = (int)(marathon%3600)/60;
		smarathon = (int)(marathon%60);
		
		//10k
		// new stuff
		tenk = pace*6.21371;
		h10k = (int)(tenk/3600);
		m10k = (int)(tenk%3600)/60;
		s10k = (int)(tenk%60);
		
		System.out.println("Hi " + name + ",");
		System.out.println("Your pace is " + (int)minPace + ":" + (int)secPace);
		System.out.printf("Your marathon time is %02d:%02d:%02d\n", (int)hmarathon, (int)mmarathon, (int)smarathon);
		System.out.printf("Your 10k time is %02d:%02d:%02d", (int)h10k, (int)m10k, (int)s10k);
	}
}
