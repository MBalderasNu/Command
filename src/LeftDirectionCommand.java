import javax.swing.JComponent;

public class LeftDirectionCommand implements Command {

	JComponent jcomp;
	
	public LeftDirectionCommand(JComponent jcomp) {
		
		this.jcomp = jcomp;
	}
	
	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		

		jcomp.setBounds(jcomp.getX()-20, jcomp.getY(), jcomp.getWidth(), jcomp.getHeight());
		
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		

		jcomp.setBounds(jcomp.getX()+20, jcomp.getY(), jcomp.getWidth(), jcomp.getHeight());
		
	}

}
