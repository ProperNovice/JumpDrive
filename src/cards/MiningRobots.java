package cards;

import enums.EAbility;

public class MiningRobots extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(1).setExplore(1).setPointsDefault(1)
				.addAbility(EAbility.BROWN_WORLDS_MINUS_1_COST);

	}

}
