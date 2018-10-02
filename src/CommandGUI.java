import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CommandGUI {
	
	private Command command;
	private ArrayList<Command> commands;
	
	
	public CommandGUI() {
		
		this.commands = new ArrayList<Command>();
		
	}
	
	public void ShowGui() {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		JPanel p = new JPanel();
		p.setLayout(null);
		
		
		JPanel l = new JPanel();
		l.setBackground(Color.black);
		l.setForeground(Color.black);
		l.setBounds(250, 250, 50,50);
		p.add(l);
		
		
		JButton upbtn = new JButton("U");
		upbtn.setBounds(180, 350, 50, 50);
		upbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				command = new UpDirectionCommand(l);
				command.Execute();
				commands.add(command);
			}
		});
		p.add(upbtn);
		
		
		JButton leftbtn = new JButton("L");
		leftbtn.setBounds(130, 400, 50, 50);
		leftbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				command = new LeftDirectionCommand(l);
				command.Execute();
				commands.add(command);

			}
		});
		p.add(leftbtn);
		
		JButton rightbtn = new JButton("R");
		rightbtn.setBounds(230, 400, 50, 50);
		rightbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				command = new RightDirectionCommand(l);
				command.Execute();
				commands.add(command);
			}
		});
		p.add(rightbtn);
		
		JButton downbtn = new JButton("D");
		downbtn.setBounds(180, 400,50, 50);
		downbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				command = new DownDirectionCommand(l);
				command.Execute();
				commands.add(command);
			}
		});
		p.add(downbtn);
		
		
		JButton undo = new JButton("UNDO");
		undo.setBounds(400, 400, 70, 50);
		undo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(commands.size() >0)
				{
					Command comm =  commands.get(commands.size()-1);
					comm.Undo();
					commands.remove(commands.size()-1);	
					
				}
				
			}
		});
		p.add(undo);
		
		
		JButton color = new JButton("Color");
		color.setBounds(335, 400, 67, 50);
		color.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				command = new ColorsCommand(l);
				command.Execute();
				commands.add(command);
			}
		});
		p.add(color);
		
		f.add(p);
		f.setSize(500, 500);
		f.setVisible(true);
		
	}
	

}
