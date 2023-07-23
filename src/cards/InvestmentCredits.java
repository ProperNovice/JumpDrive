package cards;

import enums.EAbility;

public class InvestmentCredits extends Card {

	public InvestmentCredits() {

		super.cardModel.setCost(1).setPointsDefault(1)
				.addAbility(EAbility.MINUS_1_COST_DEVELOPMENTS);

	}

}
