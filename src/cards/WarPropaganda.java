package cards;

import enums.EAbility;

public class WarPropaganda extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(2).setMilitaryPlusValue(1).setPointsDefault(3)
				.setCardsToDrawDefault(1).addAbility(
						EAbility.BEFORE_SCORING_GIVE_THIS_TO_THE_PLAYER_WITH_THE_HIGHEST_MILITARY_VALUE_IF_TIED_KEEP_IT);

	}

}
