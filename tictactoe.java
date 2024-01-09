import java.util.*;
class Main{
	public static void main(String[] args){
		char[][] board = new char[3][3];
		for(int r=0;r<board.length;r++){
			for(int c=0;c<board[r].length;c++){
				board [r][c]= '_';
			}
	//		System.out.println();
		}
		
		char player= 'X';
		boolean winwin= false;
		Scanner sc = new Scanner(System.in);
	while(!winwin){
		printboard(board);
	System.out.println("player "+player+" enter: ");
	int r=sc.nextInt();
	int c=sc.nextInt();
	System.out.println();
	
	if(board[r][c]=='_'){
		board[r][c]= player;
		winwin= ifwon(board, player);
	if(winwin){
		System.out.println("player "+ player+" has won");
	}
	else{
		if(player =='X'){
			player = 'O';
		}
		else{
			player= 'X';
		}
	}
	}
	else{
		System.out.println("this spot is taken");
	}
	
	
	
	}printboard(board);
	}
	public static void printboard(char[][] board){
		for(int r=0;r<board.length;r++){
			for(int c=0;c<board.length;c++){
				System.out.print(board[r][c] + " ");
			}
				System.out.println();
		}
		
	}
	public static boolean ifwon(char[][] board, char player){
		//if won fm row
			for(int r=0;r<board.length;r++){
				if(board[r][0]== player && board[r][1] == player  && board[r][2] == player){
					return true;
				}
	}
	//if won fm col
	for(int c=0;c<board[0].length;c++){
				if(board[0][c]== player && board[1][c] == player  && board[2][c] == player){
					return true;
				}
	}
	//if won diagonally
	if(board[0][0]== player && board[1][1] == player  && board[2][2] == player){
					return true;
				}
	if(board[0][2]== player && board[1][1] == player  && board[2][0] == player){
					return true;
				}
				return false;
}
	}