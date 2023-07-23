package cards;

import enums.EColor;
import managers.Model;

public class ConsumerMarkets extends Card {

	public ConsumerMarkets() {

		super.cardModel.setCost(2);

		super.cardModel.setPointsExtra(() -> {
			return Model.INSTANCE.boardQuantityPlanetWithColorContain(EColor.BLUE);
		});

		super.cardModel.setCardsToDrawExtra(() -> {
			return Model.INSTANCE.boardQuantityPlanetWithColorContain(EColor.BLUE);
		});

	}

}
