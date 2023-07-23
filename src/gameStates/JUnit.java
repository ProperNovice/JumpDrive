package gameStates;

import java.lang.reflect.InvocationTargetException;

import cards.Card;
import cards.ContactSpecialist;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		addCardToHand(ContactSpecialist.class);

	}

	public void addCardToHand(Class<? extends Card> cardClass) {

		Card card = null;

		try {

			card = cardClass.getConstructor().newInstance();

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		getListsManager().hand.getArrayList().addLast(card);
		getListsManager().hand.relocateImageViews();

	}

}
