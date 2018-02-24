

public class ChessBoard {
	private char[][] chessBoard;
	public ChessBoard(){
		chessBoard=new char[8][8];
		resetChessBoard();
	}
	public void resetChessBoard() {
		
		chessBoard[0][0]='r';
		chessBoard[0][1]='n';
		chessBoard[0][2]='b';
		chessBoard[0][3]='q';
		chessBoard[0][4]='k';
		chessBoard[0][5]='b';
		chessBoard[0][6]='n';
		chessBoard[0][7]='r';
		for(int i=0;i<chessBoard[1].length;i++){
			chessBoard[1][i]='p';
		}
		for(int j=2;j<6;j++){
			for(int i=0;i<chessBoard[j].length;i++){
				chessBoard[j][i]=' ';
			}
		}
		for(int i=0;i<chessBoard[6].length;i++){
			chessBoard[6][i]='P';
		}
		chessBoard[7][0]='R';
		chessBoard[7][1]='N';
		chessBoard[7][2]='B';
		chessBoard[7][3]='Q';
		chessBoard[7][4]='K';
		chessBoard[7][5]='B';
		chessBoard[7][6]='N';
		chessBoard[7][7]='R';
	
	}
	
	public void print() {
		for(int j=0;j<chessBoard.length;j++){
			System.out.printf("|");
			for(int i=0;i<chessBoard[j].length;i++){
				System.out.printf("%c|",chessBoard[j][i]);				
			}
			System.out.print("\n");
		}
		
	}
}
