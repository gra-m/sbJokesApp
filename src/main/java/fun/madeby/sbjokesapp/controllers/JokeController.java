package fun.madeby.sbjokesapp.controllers;

import fun.madeby.sbjokesapp.services.GetStringService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gra_m on 2022 03 17
 */

@Controller
public class JokeController {
    private final GetStringService GET_JOKE_SERVICE;

    public JokeController(GetStringService getJokeService) {
        GET_JOKE_SERVICE = getJokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", GET_JOKE_SERVICE.getStringFromActuator() );
        return "index";
    }


}
