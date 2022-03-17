package fun.madeby.sbjokesapp;

import fun.madeby.sbjokesapp.models.Joke;
import fun.madeby.sbjokesapp.services.GetJokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbJokesAppApplication {

    public static void main(String[] args) {
       ApplicationContext grabYourContext = SpringApplication.run(SbJokesAppApplication.class, args);

       //GetJokeService jokeService = (GetJokeService) grabYourContext.getBean("getJokeService");

        //System.out.println(jokeService.getStringFromActuator());
    }

}
