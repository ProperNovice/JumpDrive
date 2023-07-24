package cards;

import enums.EAbility;

public class InvestmentCredits extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(1).setPointsDefault(1)
				.addAbility(EAbility.MINUS_1_COST_DEVELOPMENTS);

	}

}
