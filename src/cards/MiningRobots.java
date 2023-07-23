package cards;

import enums.EAbility;

public class MiningRobots extends Card {

	public MiningRobots() {
		
		super.cardModel.setCost(1).setExplore(1).setPointsDefault(1).addAbility(EAbility.BROWN_WORLDS_MINUS_1_COST);

	}

}
