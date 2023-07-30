package cards;

import enums.EAbility;

public class GalacticAdvertisers extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(3).setCardsToDrawDefault(2)
				.addAbility(EAbility.MINUS_ONE_COST_GALACTIC_TRENDSETTLERS);

	}

}
