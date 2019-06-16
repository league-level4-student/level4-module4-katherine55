package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class BluePolymorph extends Polymorph {

	BluePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}

class RedPolymorph extends Polymorph {

	RedPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}

class MovingMorph extends Polymorph {

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		setX(getX() + 1);
		setY(getY() + 3);

	}
}

class theCirc extends Polymorph {

	int f = 1;
	int radius = 100;

	theCirc(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		setX((int) (Math.cos(f) * radius) + 100);
		setY((int) (Math.sin(f) * radius) + 100);
		f++;
	}
}

class myMouse extends Polymorph {

	myMouse(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		setX(MouseInfo.getPointerInfo().getLocation().x);
		setY(MouseInfo.getPointerInfo().getLocation().y);
	}

}

class iMaGe extends Polymorph {

	private BufferedImage img = null;

	iMaGe(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		try {
			img = ImageIO.read(new File("src/beans.jpg"));
		} catch (IOException e) {
		}

		g.drawImage(img, getX(), getY(), null);

	}

	public void update() {

	}
}

class talkToMe extends Polymorph {

	PolymorphWindow joseph = new PolymorphWindow();
	
	talkToMe(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void update() {
		if(joseph.mouseX > 50 && joseph.mouseX < 150 && joseph.mouseY > 250 && joseph.mouseY < 350) {
			JOptionPane.showMessageDialog(null, "me n the boys eating some beans");
		}
	}
}
