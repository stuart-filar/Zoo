package com.zookeeper;

public class Ocelots extends Cats {

	public Ocelots(String name, int age, String gender, String color, boolean adult, boolean alive, boolean carnivorous,
			String geographicHabitat, int numLimbs, boolean hasFur, boolean solitary, int numOffspring,
			boolean longHair, boolean scavenger) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, numLimbs, hasFur, solitary, numOffspring,
				longHair, scavenger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ocelots [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + ", adult=" + adult
				+ ", alive=" + alive + ", carnivorous=" + carnivorous + ", geographicHabitat=" + geographicHabitat;
	}

}
