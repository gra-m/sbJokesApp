package fun.madeby.sbjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Gra_m on 2022 03 17
 */

@Service
public class GetJokeService implements GetStringService {
    private final ChuckNorrisQuotes CHUCK_NORRIS_QUOTES;


    public GetJokeService() {
       this.CHUCK_NORRIS_QUOTES = new ChuckNorrisQuotes();
    }

    @Override
    public String getStringFromActuator() {
        return CHUCK_NORRIS_QUOTES.getRandomQuote();
    }
}
