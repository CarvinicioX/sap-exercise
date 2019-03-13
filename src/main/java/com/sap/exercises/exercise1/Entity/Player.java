package com.sap.exercises.exercise1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int level, overall, attack, defense, magic, cooking, crafting;

	private Player() {}

	public Player(int id, String name, int level, int attack, int defense, int magic, int cooking, int crafting) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.overall = attack + defense + magic + cooking + crafting;
		this.attack = attack;
		this.defense = defense;
		this.magic = magic;
		this.cooking = cooking;
		this.crafting = crafting;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getOverall() {
		return overall;
	}

	private void setOverall() {
		this.overall = attack + magic + cooking + crafting;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
		setOverall();
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
		setOverall();
	}

	public int getCooking() {
		return cooking;
	}

	public void setCooking(int cooking) {
		this.cooking = cooking;
		setOverall();
	}

	public int getCrafting() {
		return crafting;
	}

	public void setCrafting(int crafting) {
		this.crafting = crafting;
		setOverall();
	}

	@Override
	public String toString() {
		return "Player{" +
				"id=" + id +
				", name='" + name + '\'' +
				", level=" + level +
				", overall=" + overall +
				", attack=" + attack +
				", defense=" + defense +
				", magic=" + magic +
				", cooking=" + cooking +
				", crafting=" + crafting +
				'}';
	}
}
