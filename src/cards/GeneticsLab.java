package cards;

import enums.EColor;
import managers.Model;

public class GeneticsLab extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(1).setExplore(1).setPointsDefault(1);

		super.cardModel.setCardsToDrawExtra(() -> {

			int cardsToDrawExtra = 0;

			if (Model.INSTANCE.boardContainsPlanetWithColor(EColor.GREEN))
				cardsToDrawExtra++;

			return cardsToDrawExtra;

		});

	}

}
