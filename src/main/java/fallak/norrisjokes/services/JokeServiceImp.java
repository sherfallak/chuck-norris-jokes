package fallak.norrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {
  private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImp(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    //@Override
    //override from interface Jokeservice, make correction
    public String getJoke(){
        //will fetch the joke from class using getRandom method of chucknorris class
        return chuckNorrisQuotes.getRandomQuote();


    }

}
