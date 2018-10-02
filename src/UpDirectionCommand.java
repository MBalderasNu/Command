import javax.swing.JComponent;

public class UpDirectionCommand implements Command {
	
	JComponent jcomp;
	
	public UpDirectionCommand(JComponent jcomp) {
		
		this.jcomp = jcomp;
		
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		jcomp.setBounds(jcomp.getX(), jcomp.getY()-20, jcomp.getWidth(), jcomp.getHeight());
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		jcomp.setBounds(jcomp.getX(), jcomp.getY()+20, jcomp.getWidth(), jcomp.getHeight());
	}

}
