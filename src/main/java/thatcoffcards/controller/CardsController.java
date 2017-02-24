package thatcoffcards.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thatcoffcards.api.apiHelper;
import thatcoffcards.data.Deck;

/**
 * Created by WagnerMestrinho on 2/22/17.
 */
@RestController
public class CardsController {

    @RequestMapping(path = "/game")
    public Deck getGame(){
        apiHelper helper = new apiHelper();
        Deck myHand = helper.getCards();
        // return myCoolQuote;
        return new apiHelper().getCards();
    }
}
