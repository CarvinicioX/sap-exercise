package com.sap.exercises.exercise1.Service;

import com.sap.exercises.exercise1.Entity.Player;
import com.sap.exercises.exercise1.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public List<Player> getPlayers() {
		List<Player> players = new ArrayList<>();
		playerRepository.findAll().forEach(players::add);
		players.sort(Comparator.comparing(Player::getLevel).reversed());
		return players;
	}

	public Player getPlayer(int playerId) {
		return playerRepository.findById(playerId).get();
	}

	public void createPlayer(Player player) {
		playerRepository.save(player);
	}

	public void updatePlayer(Player player) {
		playerRepository.save(player);
	}

	public void deletePlayer(int playerId) {
		playerRepository.deleteById(playerId);
	}

	public List<Player> getPlayersByCategory(String category) {
		List<Player> players = new ArrayList<>();
		playerRepository.findAll().forEach(players::add);
		switch(category) {
			case "overall": {
				players.sort(Comparator.comparing(Player::getOverall).reversed());
				return players.subList(0, players.size() > 10 ? 10 : players.size());
			}
			case "attack": {
				players.sort(Comparator.comparing(Player::getAttack).reversed());
				return players.subList(0, players.size() > 10 ? 10 : players.size());
			}
			case "defense": {
				players.sort(Comparator.comparing(Player::getDefense).reversed());
				return players.subList(0, players.size() > 10 ? 10 : players.size());
			}
			case "magic": {
				players.sort(Comparator.comparing(Player::getMagic).reversed());
				return players.subList(0, players.size() > 10 ? 10 : players.size());
			}
			case "cooking": {
				players.sort(Comparator.comparing(Player::getCooking).reversed());
				return players.subList(0, players.size() > 10 ? 10 : players.size());
			}
			case "crafting": {
				players.sort(Comparator.comparing(Player::getCrafting).reversed());
				return players.subList(0, players.size() > 10 ? 10 : players.size());
			}
			default: {
				return null;
			}
		}
	}

}
