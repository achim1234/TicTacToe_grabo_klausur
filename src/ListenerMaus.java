import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;


public class ListenerMaus extends MouseAdapter implements ActionListener{
	
	private Hauptfenster hauptfenster;
	
	
	private JLabel[][] labelArray;
	
	
	public ListenerMaus(Hauptfenster hauptfenster) {
		this.hauptfenster = hauptfenster;
		
		
		
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
		
		
		int size_x = hauptfenster.getTicTacToeLogic().getSize();
		int size_y = hauptfenster.getTicTacToeLogic().getSize();
		
		
		//Linksklick
		if(e.getButton() == 1){
			
			labelArray = new JLabel[size_x][size_y];
			labelArray = hauptfenster.getSpielfeld().getSpielfeldLabels();
		
	
			for(int i = 0; i < size_y; i++){
			
				for(int j = 0; j < size_x; j++){
			
					if(e.getSource() == labelArray[i][j]){///
						hauptfenster.getTicTacToeLogic().setField(i, j);
						hauptfenster.getSpielfeld().repaint();
					
					}
				}
			}
		}
	}
	
	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
