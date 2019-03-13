package com.sap.exercises.exercise1.Controller;

import com.sap.exercises.exercise1.Entity.Player;
import com.sap.exercises.exercise1.Service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	private final Logger log = LoggerFactory.getLogger(PlayerController.class);

	@GetMapping("/players")
	public List<Player> readPlayers() {
		log.info("Get all Players");
		return playerService.getPlayers();
	}

	@PostMapping("/players")
	public void createPlayer(@RequestBody Player player) {
		log.info("Create Player: " + player);
		playerService.createPlayer(player);
	}

	@GetMapping("/players/{playerId}")
	public Player getPlayer(@PathVariable("playerId") int playerId) {
		log.info("Get Player: " + playerId);
		return playerService.getPlayer(playerId);
	}

	@PutMapping("/players/{playerId}")
	public String updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
		log.info("Update Player: " + player);
		player.setId(playerId);
		playerService.updatePlayer(player);
		return "Update Player: " + player;
	}

	@DeleteMapping("/players/{playerId}")
	public String deletePlayer(@PathVariable("playerId") int playerId) {
		log.info("Id: " + playerId);
		playerService.deletePlayer(playerId);
		return "Id: " + playerId;
	}

	@GetMapping("/players/overall")
	public List<Player> readByCategoryOverall() {
		log.info("Get Players by : Overall");
		return playerService.getPlayersByCategory("overall");
	}

	@GetMapping("/players/attack")
	public List<Player> readByCategoryAttack() {
		log.info("Get Players by : Attack");
		return playerService.getPlayersByCategory("attack");
	}

	@GetMapping("/players/defense")
	public List<Player> readByCategoryDefense() {
		log.info("Get Players by : Defense");
		return playerService.getPlayersByCategory("defense");
	}

	@GetMapping("/players/magic")
	public List<Player> readByCategoryMagic() {
		log.info("Get Players by : Magic");
		return playerService.getPlayersByCategory("magic");
	}

	@GetMapping("/players/cooking")
	public List<Player> readByCategoryCooking() {
		log.info("Get Players by : Cooking");
		return playerService.getPlayersByCategory("cooking");
	}

	@GetMapping("/players/crafting")
	public List<Player> readByCategoryCrafting() {
		log.info("Get Players by : Crafting");
		return playerService.getPlayersByCategory("crafting");
	}

}
