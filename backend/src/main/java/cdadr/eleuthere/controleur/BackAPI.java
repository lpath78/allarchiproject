package cdadr.eleuthere.controleur;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class BackAPI {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@GetMapping(path = "/noms")
	public String direBonjour() {
		LOG.info("GET called on /api/noms");
		return "Salut toi, on t'appellera Patryk !";
	}
}
