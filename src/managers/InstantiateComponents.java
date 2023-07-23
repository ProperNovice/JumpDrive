package managers;

import cards.Card;
import cards.ContactSpecialist;
import cards.TradePact;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		addCardsToDeck();

	}

	private void addCardsToDeck() {

		addCardToDeck(ContactSpecialist.class, 3);
		addCardToDeck(TradePact.class, 5);

	}

	private void addCardToDeck(Class<? extends Card> cardClass, int amount) {

		Card card = null;

		try {

			card = cardClass.getConstructor().newInstance();
			card.getImageView().setVisible(false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
