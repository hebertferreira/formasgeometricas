package entities;

import entities.enums.Color;

public abstract class FormaGeometrica {

	private Color color;
	
	public FormaGeometrica() {
		
	}

	public FormaGeometrica(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
