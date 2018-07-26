package com.mkyong.common;

public class Panda {
	private KungFu kungfu;

	public Panda(KungFu kungfu) {
		System.out.println("autowiring by constructor1");
		this.kungfu = kungfu;
	}

	
	public Panda(String kungfu) {
		System.out.println("autowiring by constructor2");
	}
	
	public KungFu getKungfu() {
		return kungfu;
	}

	public void setKungfu(KungFu kungfu) {
		System.out.println("autowiring by type");
		this.kungfu = kungfu;
	}

	@Override
	public String toString() {
		return "Person [kungfu=" + kungfu + "]";
	}

}