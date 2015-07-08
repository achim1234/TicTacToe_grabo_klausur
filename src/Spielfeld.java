import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import de.fhwgt.tictactoe.TicTacToeEvent;


public class Spielfeld extends JPanel{
	
	private JLabel[][] spielfeld;
	private int zeilen;
	private int spalten;
	private Hauptfenster hauptfenster;
	
	Spielfeld(Hauptfenster hauptfenster){
		
		this.hauptfenster = hauptfenster;
		zeilen = hauptfenster.getTicTacToeLogic().getSize();
		spalten = hauptfenster.getTicTacToeLogic().getSize();
		
		//this.hauptfenster.setLayout(new GridLayout(zeilen, spalten));
		
		
		
		this.createSpielfeld();
	}
	
	
	
	
	public void createSpielfeld(){
		this.setLayout(new GridLayout(zeilen, spalten)); //JLabel bekommt ein GridLayout
		spielfeld = new JLabel[zeilen][spalten];
		
		
		
		
		//Label mit größe 70 x 70 anlegen
		
		
		for(int yAchse = 0; yAchse < spalten; yAchse++){ //zuerst alle Spalten in erster Zeile durchgehen
			
			for(int xAchse = 0; xAchse < zeilen; xAchse++){
				
				spielfeld[yAchse][xAchse] = new JLabel();
				spielfeld[yAchse][xAchse].setPreferredSize(new Dimension(70, 70));
				spielfeld[yAchse][xAchse].setBackground(Color.gray);
				spielfeld[yAchse][xAchse].setBorder(BorderFactory.createLineBorder(Color.black));
				
				spielfeld[yAchse][xAchse].addMouseListener(new ListenerMaus(this.hauptfenster));
				spielfeld[yAchse][xAchse].setOpaque(true);
				this.add(spielfeld[yAchse][xAchse]);
				
			}
		
		}
	}
	
	
	public void drawSpielfeld(TicTacToeEvent e){
		
		if(hauptfenster.getTicTacToeLogic().getactivePoint() != null){
			if(e.getSpieler() == 1){
				this.spielfeld[hauptfenster.getTicTacToeLogic().getactivePoint().x][hauptfenster.getTicTacToeLogic().getactivePoint().y].setText("O");
				this.spielfeld[hauptfenster.getTicTacToeLogic().getactivePoint().x][hauptfenster.getTicTacToeLogic().getactivePoint().y].setHorizontalAlignment(JLabel.CENTER);
			}
			else{
				this.spielfeld[hauptfenster.getTicTacToeLogic().getactivePoint().x][hauptfenster.getTicTacToeLogic().getactivePoint().y].setText("X");
				this.spielfeld[hauptfenster.getTicTacToeLogic().getactivePoint().x][hauptfenster.getTicTacToeLogic().getactivePoint().y].setHorizontalAlignment(JLabel.CENTER);
			}
			
			
		}
		
		hauptfenster.getTicTacToeLogic().printBoard(); //gibt Besetzung des Spielfelds auf der Konsole aus
		System.out.println();
		System.out.println();
		
		
		
	}
	
	public void paintBackground(Color color){
		
		for(int y_achse = 0; y_achse < zeilen; y_achse++){
			for(int x_achse = 0; x_achse < spalten; x_achse++){	
				spielfeld[y_achse][x_achse].setBackground(color);;
				this.add(spielfeld[y_achse][x_achse]);
			}
		}
	}
	
	
	
	public JLabel[][] getSpielfeldLabels(){
		return this.spielfeld;
	}
	
	/*public void clearSpielfeld(){
		for(int k=0; k < zeilen; k++){
            for(int j=0; j < spalten; j++){
                    spielfeld[k][j].setText("");
            } 
		}
	
		
	}*/
	
}
