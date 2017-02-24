package thatcoffcards.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import thatcoffcards.data.Deck;

/**
 * Created by WagnerMestrinho on 2/22/17.
 */
public class apiHelper {

    public Deck getCards() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", HttpMethod.GET, entity, Deck.class);
        Deck myDeck = (Deck) response.getBody();
        return myDeck;
    }

    public Deck getDraw() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://deckofcardsapi.com/api/deck/new/draw/?count=5\n", HttpMethod.GET, entity, Deck.class);
        Deck myDraw = (Deck) response.getBody();
        return myDraw;
    }

    public Deck getShuffle() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://deckofcardsapi.com/api/deck/new/shuffle/", HttpMethod.GET, entity, Deck.class);
        Deck myShuffle = (Deck) response.getBody();
        return myShuffle;
    }

    public Deck getDeck() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://deckofcardsapi.com/api/deck/new/", HttpMethod.GET, entity, Deck.class);
        Deck myNewDeck = (Deck) response.getBody();
        return myNewDeck;
    }

    public Deck getPartialDeck() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://deckofcardsapi.com/api/deck/new/shuffle/?cards=AS,2S,KS,AD,2D,KD,AC,2C,KC,AH,2H,KH", HttpMethod.GET, entity, Deck.class);
        Deck myPartialDeck = (Deck) response.getBody();
        return myPartialDeck;

    }
}