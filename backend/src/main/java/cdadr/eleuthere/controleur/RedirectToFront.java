package cdadr.eleuthere.controleur;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectToFront {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	/*
	 * Transmet la requête au Front si l'URL est différente de '/', '/index.html',
	 * '/api' et '/api/**'
	 */
	/*
	 * Ceci est nécessaire à cause de l'usage du history mode
	 */

	@RequestMapping(value = "{url:^(?!index\\.html|api).*$}")
	public String redirectAPI(@PathVariable String url) {
		LOG.info("Redirection nécessaire, saisie manuelle : " + url);
		return "forward:/";
	}
}