package juego;

import java.awt.Color;

import entorno.Entorno;

public class Rectangulo {
	private double x;
	private double y;
	private double ancho;
	private double alto;
	private double velocidad;
	private Color color;
	

	public Rectangulo(double x, double y) {
		this.x=x;
		this.y=y;
		this.ancho=100;
		this.alto=50;
		this.velocidad=5;
		this.color=new Color(236, 240, 241);
		
	}
	
	public void dibujar(Entorno e) {
		e.dibujarRectangulo(x, y, ancho,alto, 0,color);
		}
	
	public void moverIzquierda(Entorno e) {
		if (x - ancho/2 > 0) {
			this.x -= velocidad;
		}
	}
	
	public void moverDerecha(Entorno e) {
		if(x+ancho/2<e.ancho()) {
			this.x+=velocidad;
		}
	}
	
	
		
	
	
	
	
}
