package gameStates;

import java.lang.reflect.InvocationTargetException;

import cards.Card;
import cards.ColonyConvoy;
import cards.ContactSpecialist;
import cards.GeneticsLab;
import cards.InvestmentCredits;
import cards.MilitaryConvoy;
import cards.MiningRobots;
import cards.TradePact;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		addCardToBoard(ContactSpecialist.class);
		addCardToBoard(ContactSpecialist.class);
		addCardToBoard(ContactSpecialist.class);
		addCardToHand(ContactSpecialist.class);
		addCardToHand(TradePact.class);
		addCardToHand(MiningRobots.class);
		addCardToHand(MilitaryConvoy.class);
		addCardToHand(ColonyConvoy.class);
		addCardToHand(InvestmentCredits.class);
		addCardToHand(GeneticsLab.class);

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
