package MouseEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseEventListerner extends JFrame implements MouseListener{
	
	ImageIcon image = new ImageIcon("letter.png");
	
	ImageIcon surprise;
	ImageIcon sad;
	ImageIcon heart;
	ImageIcon scared;
	ImageIcon annoyed;
	
	JLabel label;
	
	MouseEventListerner(){
		this.setSize(500, 500);
		this.setTitle("Mouse Event Listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setIconImage(image.getImage());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		surprise=new ImageIcon("surprise.png");
		sad=new ImageIcon("sad.png");
		heart=new ImageIcon("heart_love.png");
		scared=new ImageIcon("scared.png");
		annoyed=new ImageIcon("annoyed.png");
		
		label.setIcon(surprise);
		
		this.add(label);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked");
		label.setIcon(sad);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
		label.setIcon(heart);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
		label.setIcon(surprise);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
		label.setIcon(scared);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
		label.setIcon(annoyed);
	}
}
