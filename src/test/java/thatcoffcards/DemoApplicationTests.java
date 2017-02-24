package thatcoffcards;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import thatcoffcards.api.apiHelper;
import thatcoffcards.data.Deck;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void cardsTest() {
		apiHelper Pick = new apiHelper();
		Deck gotCards = Pick.getCards();
		//RestTemplate restTemplate = new RestTemplate();
		//Cards shuffle = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Cards.class);
		System.out.println(gotCards);
	}

	@Test
	public void handsTest() {
		apiHelper Pick = new apiHelper();
		Deck gotHand = Pick.getDraw();
		//RestTemplate restTemplate = new RestTemplate();
		//Cards shuffle = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Cards.class);
		System.out.println(gotHand);


	}

	@Test
	public void shuffleTest() {
		apiHelper Pick = new apiHelper();
		Deck gotShuffled = Pick.getShuffle();
		//RestTemplate restTemplate = new RestTemplate();
		//Cards shuffle = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Cards.class);
		System.out.println(gotShuffled);

	}

	@Test
	public void deckTest() {
		apiHelper Pick = new apiHelper();
		Deck gotDeck = Pick.getDeck();
		//RestTemplate restTemplate = new RestTemplate();
		//Cards shuffle = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Cards.class);
		System.out.println(gotDeck);
	}

	@Test
	public void partialDeckTest() {
		apiHelper Pick = new apiHelper();
		Deck gotPartialDeck = Pick.getPartialDeck();
		//RestTemplate restTemplate = new RestTemplate();
		//Cards shuffle = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Cards.class);
		System.out.println(gotPartialDeck);
	}
}