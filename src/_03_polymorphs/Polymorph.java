package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    private int width;
    private int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    int getX() {
    	return this.x;
    }
    
    void setX(int num) {
    	this.x = num;
    }

    int getY() {
    	return this.y;
    }
    
    void setY(int num) {
    	this.y = num;
    }
    
	int getHeight() {
		return this.height;
	}

	void setHeight(int num) {
		this.height = num;
	}
	
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int num) {
		this.width = num;
	}
	
    public void update(){ 
    }
    
    public abstract void draw(Graphics g);

}
