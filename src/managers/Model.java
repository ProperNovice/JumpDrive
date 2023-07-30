package managers;

import cards.Card;
import cards.CardModel;
import enums.EColor;

public enum Model {

	INSTANCE;

	private Model() {

	}

	public boolean boardContainsPlanetWithColor(EColor eColor) {

		for (Card card : ListsManager.INSTANCE.board) {

			CardModel cardModel = card.getCardModel();

			if (!cardModel.isPlanet())
				continue;

			if (cardModel.isColorPlanet(eColor))
				return true;

		}

		return false;

	}

	public int boardGetQuantityOfPlanetsWithColor(EColor eColor) {

		int quantity = 0;

		for (Card card : ListsManager.INSTANCE.board) {

			CardModel cardModel = card.getCardModel();

			if (!cardModel.isPlanet())
				continue;

			if (cardModel.isColorPlanet(eColor))
				quantity++;

		}

		return quantity;

	}

}
