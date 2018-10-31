import java.awt.BorderLayout;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TicTacToeServer extends JFrame{

	private String[] board = new String[9];
	private JTextArea outputArea;
	private Player[] players;
	private ServerSocket server;
	private int currentPlayer;
	private final static int PLAYER_X = 0;
	private final static int PLAYER_O = 0;
	private final String[] MARKS = {"X", "O"};
	private ExecutorService runGame;
	private Lock ganeLock;
	private Condition otherPlayerConnected;
	private Condition otherPlayerTurn;
	
	
	
	private class Player implements Runnable{
		super("Tic-Tac-Toe Server");

		runGame = Executors.newFixedThreadPool(2);
		gameLock = new ReentrantLock();

		otherPlayerConnected = gameLock.newCondition();
	
		otherPlayerTurn = gameLock.newCondition();

		for(int i = 0; i < 9; i++)
			board[i] = new String("");

		players = new Player[2];
		currentPlayer = PLAYER_X;

		try{
			server = new ServerSocket(12345, 2);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
			System.exit(1);
		}							
					
		outputArea = new JTextArea();	
		add(outputArea, BorderLayout.CENTER);
		outputArea.setText("Server awaiting connections\n");

		setSize(300,300);
		setVisible(true);
	
	}
	
	public void execute(){

		for( int i = 0; i < players.length; i++ ){
			try{
				players[i] = new Player(server.accept(), i);
			}
			catch(IOException ioException){
				ioException.printStackTrace();
				System.exit(1);
			}
		}
	}

}

