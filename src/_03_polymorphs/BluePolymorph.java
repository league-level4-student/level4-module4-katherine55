package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}

class RedPolymorph extends Polymorph{

	RedPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}

class MovingMorph extends Polymorph{

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		setX(getX()+1);
		setY(getY()+3);
		
	}
}

class theCirc extends Polymorph{
	
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
			setX((int)(Math.cos(f)*radius) +100);
			setY((int)(Math.sin(f)*radius) +100);
			f++;
	}
}

class myMouse extends Polymorph{

	myMouse(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {

	}
}

