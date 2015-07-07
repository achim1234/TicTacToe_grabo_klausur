import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import de.fhwgt.tictactoe.TicTacToeEvent;
import de.fhwgt.tictactoe.TicTacToeLogic;


public class Hauptfenster extends JFrame{
	private Spielfeld spielfeld;
	
	private TicTacToeLogic ticTacToeLogic;

	
	
	Hauptfenster(){
		this.ticTacToeLogic = new TicTacToeLogic();
		this.setTitle("TicTacToe");

		
		spielfeld = new Spielfeld(this); //neues Spielfeld zeichnen

		
		this.ticTacToeLogic.addTicTacToeListener(new Listener(this)); //TicTacToe Listener wird registriert
		
		this.setResizable(false); //Fenster kann mit Maus nicht vergrößert werden
		this.pack();
	
		this.setVisible(true);
		
	}
	
	
	public TicTacToeLogic getTicTacToeLogic(){
		return this.ticTacToeLogic;
	}
	
	public void repaintGame(){
		spielfeld.clearSpielfeld();
		spielfeld.fillSpielfeld();
	}
	
	public Spielfeld getSpielfeld(){
		return spielfeld;
	}
	
	

	public static void main(String[] args) {
		new Hauptfenster();

	}

}
