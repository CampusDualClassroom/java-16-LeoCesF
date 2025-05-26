package com.campusdual.classroom;

public class Plane implements IMachine {

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println(this.name + " está encendido");
	}

	@Override
	public void stop() {
		System.out.println(this.name + " está apagado");
	}

	@Override
	public void maintenance() {
		System.out.println(this.name + " se encuentra realizando un mantenimiento");
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}
}
