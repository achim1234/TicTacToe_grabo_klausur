import java.awt.BorderLayout;
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
	private int spielfeldMatrix = 3;
	
	
	Hauptfenster(){
		
		this.setTitle("TicTacToe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); //Fenster kann mit Maus nicht vergrößert werden
		this.setLayout(new BorderLayout()); // Dem Fenster ein BorderLayout geben
		
		this.initTicTacToe();
		
		this.setLocationRelativeTo(null); //Fenster in mitte des Bildschirm
		this.pack();
		this.setVisible(true);
		this.requestFocus();
	}
	
	
	public void initTicTacToe(){
		
		this.ticTacToeLogic = new TicTacToeLogic(spielfeldMatrix);
		this.ticTacToeLogic.addTicTacToeListener(new Listener(this)); //TicTacToe Listener wird registriert
		
		this.spielfeld = new Spielfeld(this); //neues Spielfeld zeichnen
		this.add(BorderLayout.CENTER, this.spielfeld);
	}
	
	
	public TicTacToeLogic getTicTacToeLogic(){
		return this.ticTacToeLogic;
	}
	
	public void repaintGame(TicTacToeEvent e){
		spielfeld.drawSpielfeld(e);
	}
	
	public Spielfeld getSpielfeld(){
		return spielfeld;
	}
	
	

	public static void main(String[] args) {
		new Hauptfenster();

	}

}
