package managers;

import cards.Card;
import cards.ContactSpecialist;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		addCardsToDeck();

	}

	private void addCardsToDeck() {

		addCardToDeck(ContactSpecialist.class, 3);

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
