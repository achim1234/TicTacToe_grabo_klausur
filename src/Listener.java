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
		hauptfenster.repaintGame();
		
		
		
		
	}

	
	
	
	/*Spielzustand hat sich geändert
	 *Zustände sind: 
	 *	- Spieler hat gewonnen
	 *  - TicTacToe hat gewonnen
	 *  - unentschieden
	 */
	
	public void StatusChanged(TicTacToeEvent e) {
		
		
		//e.getStatus() liefert aktuellen Status des Spiels, z.B. NOWINNER; SPIELER; TicTacToe; FINISH
		
		
		
		
		
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.NOWINNER){
			System.out.println("noch kein Gewinner, spiel läuft");
			
			
			
		}
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.SPIELER){
			System.out.println("Spieler hat gewonnen");
			
			
			
		}
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.TicTacToe){
			System.out.println("Spielelogik ist Gewinner");
			
			
			
		}
		
		if(hauptfenster.getTicTacToeLogic().getWinner() == TicTacToeLogic.FINISH){
			System.out.println("Unentschieden");
			
			
			
		}
		
		
		
		
		
		
		
		
		
	/*	if(e.getWinner() == TicTacToeLogic.NOWINNER){
			System.out.println("Spiel läuft");
		}
		
		if(TicTacToeLogic.) == TicTacToeLogic.SPIELER){
			System.out.println("Spieler");
		}
		
		if(e.getStatus() == TicTacToeLogic.TicTacToe){
			System.out.println("Gegner");
		}
		
		if(e.getStatus() == TicTacToeLogic.FINISH){
			System.out.println("Alle Spielfelder besetzt und es gibt keinen Gewinner");
		}
		
		*/
		
		
		
			
			
		
		
		
	}

}
