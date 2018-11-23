package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class TelaGeral extends JFrame {

	public TelaGeral(String titulo,int x,int y)  {
		super(titulo);
		setSize(x,y);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
		
	}

}
