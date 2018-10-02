import javax.swing.JComponent;

public class RightDirectionCommand implements Command {

	JComponent jcomp;
	
	public RightDirectionCommand(JComponent jcomp) {
		
		this.jcomp = jcomp;
	}
	
	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		

		jcomp.setBounds(jcomp.getX()+20, jcomp.getY(), jcomp.getWidth(), jcomp.getHeight());
		
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		

		jcomp.setBounds(jcomp.getX()-20, jcomp.getY(), jcomp.getWidth(), jcomp.getHeight());
		
	}

}
