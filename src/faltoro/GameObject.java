package faltoro;


public abstract class GameObject {

	protected int color;
	protected int pos_x;
	protected int pos_y;
	protected int height;
	protected int width;
	 
	int getColor() {
		return color;
	}
	int getHeight() {
		return height;
	}
	int getWidth() {
		return width;
	}
	int getX() {
		return pos_x;
	}
	int getY() {
		return pos_y;
	}
}