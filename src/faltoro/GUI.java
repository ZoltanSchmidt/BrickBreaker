package faltoro;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


class GUI extends JPanel {

	private static final long serialVersionUID = 1L;
	private DrawPanel drawPanel;
	
	
	public GUI() {
		// TODO Auto-generated constructor stub
	}

	private class DrawPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		private ArrayList<GameObject> objects = new ArrayList<GameObject>();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			for (GameObject g_o : objects) {
				g.drawOval(g_o.getX(), g_o.getY(), g_o.getWidth(),g_o.getHeight());
			
			}
		}
	}

}
