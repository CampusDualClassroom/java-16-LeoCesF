package com.campusdual.classroom;

public class Tractor implements IMachine {

	protected int horsePower = 0;
	
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void start() {
		System.out.println("Tractor está encendido");
	}

	@Override
	public void stop() {
		System.out.println("Tractor está apagado");
	}

	@Override
	public void maintenance() {
		System.out.println("Tractor se encuentra realizando un mantenimiento");
	}

	public void forward() {
		System.out.println("El tractor avanza");
	}

	public void backward() {
		System.out.println("El tractor retrocede");
	}

}
