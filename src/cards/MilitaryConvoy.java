package cards;

import enums.EAbility;

public class MilitaryConvoy extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(1).setExplore(1).setMilitary(1)
				.addAbility(EAbility.MAY_SETTLE_A_SECOND_MILITARY_PLANET_WITH_YOUR_UNUSED_MILITARY);

	}

}
