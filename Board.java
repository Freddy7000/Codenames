import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Board extends JPanel implements ActionListener {

	public Board(){
	}

	private void gameBackround(Graphics g){
		Color velvetRed = new Color(77,0,0);
		g.setColor(velvetRed);
		//getWidth() and getHeight() are Dimension methods
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(1000,1000);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		gameBackround(g);
	}

	public void actionPerformed(ActionEvent e) {

	}

}