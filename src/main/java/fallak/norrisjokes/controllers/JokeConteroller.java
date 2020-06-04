package fallak.norrisjokes.controllers;

import fallak.norrisjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeConteroller {
    //instance of jokeService classes using JokeService interface
    private JokeService jokeService;

    @Autowired
    public JokeConteroller(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        //attribute anme joke is the text name will display is b/w tages of html
    model.addAttribute("joke",jokeService.getJoke());
    //return string is the name of html page chuchnorris
    return "chucknorris";
    }
}
