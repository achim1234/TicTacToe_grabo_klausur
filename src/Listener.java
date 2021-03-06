import java.awt.Color;

import de.fhwgt.tictactoe.TicTacToeEvent;
import de.fhwgt.tictactoe.TicTacToeListener;
import de.fhwgt.tictactoe.TicTacToeLogic;


public class Listener implements TicTacToeListener{
	
	private Hauptfenster hauptfenster;
	
	Listener(Hauptfenster hauptfenster){
		this.hauptfenster = hauptfenster;
	}
	
	
	//es wurde ein Feld im Spielfeld gesetzt
	public void ModelChanged(TicTacToeEvent e) { 
		//spielfeld neu zeichnen, da in spieler ein kreuz gemacht hat, oder die spielelogik
		hauptfenster.repaintGame(e);
		
	}

	
	
	
	/*Spielzustand hat sich ge�ndert
	 *Zust�nde sind: 
	 *	- Spieler hat gewonnen
	 *  - TicTacToe hat gewonnen
	 *  - unentschieden
	 */
	
	public void StatusChanged(TicTacToeEvent e) {
		
		
		//e.getStatus() liefert aktuellen Status des Spiels, z.B. NOWINNER; SPIELER; TicTacToe; FINISH
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.NOWINNER){
			System.out.println("noch kein Gewinner, spiel l�uft");
		
		}
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.SPIELER){
			System.out.println("Spieler hat gewonnen");
			hauptfenster.getSpielfeld().paintBackground(Color.GREEN);
		
		}
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.TicTacToe){
			System.out.println("Spielelogik ist Gewinner");
			hauptfenster.getSpielfeld().paintBackground(Color.YELLOW);
		}
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.FINISH){
			System.out.println("Unentschieden");
			hauptfenster.getSpielfeld().paintBackground(Color.RED);
		}
	}

}
