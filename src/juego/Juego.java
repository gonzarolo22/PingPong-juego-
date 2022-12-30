package juego;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {

	private Entorno entorno;
	private Rectangulo rectangulo;
	private Pelota pelota;
	
	
	
	
	
	
	public Juego() {
		this.entorno = new Entorno(this, "Titulo de TP - Grupo N - Apellido1 - Apellido2 -Apellido3 - V0.01", 800, 600);
		this.entorno.iniciar();
		this.rectangulo=new Rectangulo(400,600);
		this.pelota=new Pelota();
	}

	
	
	
	
	
	
	public void tick() {
		
		pelota.dibujarPelota(entorno);
		pelota.avanzarPelota();
		rectangulo.dibujar(entorno);
		
		if(entorno.estaPresionada(entorno.TECLA_IZQUIERDA)) {
			rectangulo.moverIzquierda(entorno);
		}
		if(entorno.estaPresionada(entorno.TECLA_DERECHA)) {
			rectangulo.moverDerecha(entorno);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}

}
