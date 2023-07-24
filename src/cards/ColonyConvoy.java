package cards;

import enums.EAbility;

public class ColonyConvoy extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(1).setExplore(1).addAbility(
				EAbility.MAY_DISCARD_FROM_EMPIRE_TO_PLACE_A_SECOND_WORLD_AT_MINUS_2_COST_BOTH_WORLDS_MUST_BE_NON_MILITARY);

	}

}
