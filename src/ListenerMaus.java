import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ListenerMaus implements MouseListener{
	
	private Hauptfenster hauptfenster;
	
	
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
		System.out.println("Feld angeklickt");
		
		//player position x 
		//player position y benötigt
		
	//	hauptfenster.getTicTacToeLogic().setField(0, y);
		
		
		////hauptfenster.
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
