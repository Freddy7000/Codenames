import javax.swing.JFrame;
public class Runner
{
	public static void main(String args[])
	{
		Board game = new Board();
		JFrame frame = new JFrame("Codenames");
		
		frame.add(game);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}