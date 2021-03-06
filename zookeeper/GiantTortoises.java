package com.zookeeper;

public class GiantTortoises extends ReptilesAndAmphibians {

	public GiantTortoises(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, boolean isReptile, boolean hasShell, boolean livesOnLand,
			int numLimbs, int numEggs, boolean venomous) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, isReptile, hasShell, livesOnLand,
				numLimbs, numEggs, venomous);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GiantTortoises [isReptile=" + isReptile + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", color=" + color + ", adult=" + adult + ", alive=" + alive + ", carnivorous=" + carnivorous
				+ ", geographicHabitat=" + geographicHabitat;
	}

}
