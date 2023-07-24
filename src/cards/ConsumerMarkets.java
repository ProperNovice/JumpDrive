package cards;

import enums.EColor;
import managers.Model;

public class ConsumerMarkets extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(2);

		super.cardModel.setPointsExtra(() -> {
			return Model.INSTANCE.boardQuantityPlanetWithColorContain(EColor.BLUE);
		});

		super.cardModel.setCardsToDrawExtra(() -> {
			return Model.INSTANCE.boardQuantityPlanetWithColorContain(EColor.BLUE);
		});

	}

}
