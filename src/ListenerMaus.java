import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;


public class ListenerMaus implements MouseListener{
	
	private Hauptfenster hauptfenster;
	private int sizeFelderQuadrat; //TicTacToe Feld ist immer Quadratisch
	
	private JLabel[][] labelArray;
	
	
	public ListenerMaus(Hauptfenster hauptfenster) {
		this.hauptfenster = hauptfenster;
		sizeFelderQuadrat = hauptfenster.getTicTacToeLogic().getSize();
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		
		
	//	System.out.println("Feld angeklickt");
	//	System.out.println("activePoint: " + hauptfenster.getTicTacToeLogic().getactivePoint());
		
		labelArray = new JLabel[sizeFelderQuadrat][sizeFelderQuadrat];
		labelArray = hauptfenster.getSpielfeld().getSpielfeldArray();
		
	
		
	
		
		for(int i = 0; i < sizeFelderQuadrat; i++){
			for(int j = 0; j < sizeFelderQuadrat; j++){
			
				if(e.getSource() == labelArray[i][j]){///
					hauptfenster.getTicTacToeLogic().setField(i, j);
					//hauptfenster.getSpielfeld().
					//System.out.println(i + ", " + j);
						
				}
			}
		}
			
						
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
