import java.util.*;
 class Bloodbank{
	 public static void main(String[] args){
	String[] type= {"a", "b", "o", "ab"};
	Scanner sc= new Scanner(System.in);
	
		 System.out.println("enter bloodtype");
	String entertype= sc.nextLine();
	System.out.println("enter number of bottles required");
	int botreq= sc.nextInt();
	

	 if (entertype.equals(type[0])) {
			int avaibot= 5;
		if(botreq>avaibot){
		System.out.println("sorry we don't have enough bottles");
		}
		else{
			int botsent=(avaibot-botreq);
			System.out.println(botreq+ " bottles have been sent, "+botsent +" bottles are remaining now");
		}
        }
	if (entertype.equals(type[1])) {
          	int avaibot= 7;
		if(botreq>avaibot){
		System.out.println("sorry we don't have enough bottles");
		}
		else{
			int botsent=(avaibot-botreq);
			System.out.println(botreq+ " bottles have been sent, "+botsent +" bottles are remaining now");
		}
        }
		if (entertype.equals(type[2])) {
           	int avaibot= 12;
		if(botreq>avaibot){
		System.out.println("sorry we don't have enough bottles");
		}
		else{
			int botsent=(avaibot-botreq);
			System.out.println(botreq+ " bottles have been sent, "+botsent +" bottles are remaining now");
		}
        }
		if (entertype.equals(type[3])) {
          int avaibot= 3;
		if(botreq>avaibot){
		System.out.println("sorry we don't have enough bottles");
		}
		else{
			int botsent=(avaibot-botreq);
			System.out.println(botreq+ " bottles have been sent, "+botsent +" bottles are remaining now");
		}
        }
	}
 }