package com.sap.exercises.exercise1.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

	@Test
	public void getName() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals("CarvinicioX", player.getName());
	}

	@Test
	public void setName() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setName("GregarX");
		assertEquals("GregarX", player.getName());
	}

	@Test
	public void getLevel() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(100, player.getLevel());
	}

	@Test
	public void setLevel() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setLevel(110);
		assertEquals(110, player.getLevel());
	}

	@Test
	public void getOverall() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(80 + 50 + 150 + 120 + 130, player.getOverall());
	}

	@Test
	public void getAttack() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(80, player.getAttack());
	}

	@Test
	public void setAttack() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setAttack(100);
		assertEquals(100, player.getAttack());
	}

	@Test
	public void getDefense() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(50, player.getDefense());
	}

	@Test
	public void setDefense() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setDefense(70);
		assertEquals(70, player.getDefense());
	}

	@Test
	public void getMagic() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(150, player.getMagic());
	}

	@Test
	public void setMagic() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setMagic(200);
		assertEquals(200, player.getMagic());
	}

	@Test
	public void getCooking() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(120, player.getCooking());
	}

	@Test
	public void setCooking() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setCooking(100);
		assertEquals(100, player.getCooking());
	}

	@Test
	public void getCrafting() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		assertEquals(130, player.getCrafting());
	}

	@Test
	public void setCrafting() {
		Player player = new Player(1, "CarvinicioX", 100, 80, 50, 150, 120, 130);
		player.setCrafting(80);
		assertEquals(80, player.getCrafting());
	}
}