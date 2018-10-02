import java.awt.Color;
import java.util.Random;

import javax.swing.JComponent;

public class ColorsCommand implements Command {

	JComponent jcomp;
	
	Color previouscolor;
	
	public ColorsCommand(JComponent jcomp) {
		
		this.jcomp = jcomp;
	}
	
	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		previouscolor = jcomp.getBackground();
		
		Color ncolor = Color.magenta;
		
		Random rand = new Random();
		
		int colorselection = rand.nextInt(5);
		
		switch(colorselection) {
		
		case 0:
			
			ncolor = Color.blue;
			break;
			
		case 1:
			
			ncolor = Color.yellow;
			break;
			
		case 2:
			
			ncolor = Color.green;
			break;
			
		case 3:

			ncolor = Color.red;
			break;
			
		case 4:
			
			ncolor = Color.orange;
			break;
		}
		
		jcomp.setBackground(ncolor);
		
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		
		jcomp.setBackground(previouscolor);
		
	}

}
