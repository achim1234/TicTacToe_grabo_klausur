import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Spielfeld {
	
	private JLabel[][] spielfeld;
	private int zeilen = 3;
	private int spalten = 3;
	private Border border;
	private Hauptfenster hauptfenster;
	
	Spielfeld(Hauptfenster hauptfenster){
		
		this.hauptfenster = hauptfenster;
		
		this.hauptfenster.setLayout(new GridLayout(zeilen, spalten));
		
		
		border = LineBorder.createBlackLineBorder();
		
		
		
		spielfeld = new JLabel[zeilen][spalten];
		
		//Label mit größe 70 x 70 anlegen
		
		
		for(int yAchse = 0; yAchse < spalten; yAchse++){ //zuerst alle Spalten in erster Zeile durchgehen
			
			for(int xAchse = 0; xAchse < zeilen; xAchse++){
				
				spielfeld[yAchse][xAchse] = new JLabel();
				spielfeld[yAchse][xAchse].setPreferredSize(new Dimension(70, 70));
				spielfeld[yAchse][xAchse].setBackground(Color.gray);
				spielfeld[yAchse][xAchse].setBorder(border);
				spielfeld[yAchse][xAchse].setOpaque(true);
				spielfeld[yAchse][xAchse].addMouseListener(new ListenerMaus(hauptfenster));
				this.hauptfenster.add(spielfeld[yAchse][xAchse]);
				
			}
		
		}
		this.fillSpielfeld();
	}
	
	
	public void fillSpielfeld(){
		//Spielfiguren aus logik holen
		
		
		hauptfenster.getTicTacToeLogic().setField(0, 0);
		spielfeld[0][0].setText("x");
		
		
		
		
	}
	
	public void clearSpielfeld(){
		for(int k=0; k < zeilen; k++){
            for(int j=0; j < spalten; j++){
                    spielfeld[k][j].setText("");
            } 
		}
		
	}
	
	
	
	

}
