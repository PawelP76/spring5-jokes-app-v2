package guru.springframework.spring5jokesapp;

import guru.springframework.spring5jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private JokesService    jokesService;

    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping({"","/"})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}