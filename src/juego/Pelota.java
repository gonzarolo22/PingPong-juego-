package juego;

import entorno.Entorno;

public class Pelota {
	
	int x;
	int y;
	
	public Pelota() {
		this.x=50;
		this.y=50;
		}
	
	
	public void dibujarPelota(Entorno e) {
		e.dibujarCirculo(x, y, 50, null);
		
	}


	public void avanzarPelota() {
		this.x ++;
		
		
	}
	
}
