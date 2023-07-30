package gameStates;

import java.lang.reflect.InvocationTargetException;

import cards.Card;
import cards.ColonyConvoy;
import cards.ContactSpecialist;
import cards.GalacticAdvertisers;
import cards.MiningConglomerate;
import cards.SpaceMarines;
import cards.WarPropaganda;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		addCardToBoard(ContactSpecialist.class);
		addCardToBoard(ContactSpecialist.class);
		addCardToBoard(ContactSpecialist.class);
		addCardToHand(ColonyConvoy.class);
		addCardToHand(SpaceMarines.class);
		addCardToHand(WarPropaganda.class);
		addCardToHand(GalacticAdvertisers.class);
		addCardToHand(MiningConglomerate.class);

	}

	public void addCardToHand(Class<? extends Card> cardClass) {

		Card card = getCard(cardClass);

		getListsManager().hand.getArrayList().addLast(card);
		getListsManager().hand.relocateImageViews();

		card.print();

	}

	public void addCardToBoard(Class<? extends Card> cardClass) {

		Card card = getCard(cardClass);
		getListsManager().board.getArrayList().addLast(card);
		getListsManager().board.relocateImageViews();

	}

	private Card getCard(Class<? extends Card> cardClass) {

		Card card = null;

		try {

			card = cardClass.getConstructor().newInstance();

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return card;

	}

}
