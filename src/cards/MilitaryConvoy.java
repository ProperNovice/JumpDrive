package cards;

import enums.EAbility;

public class MilitaryConvoy extends Card {

	public MilitaryConvoy() {

		super.cardModel.setCost(1).setExplore(1).setMilitary(1)
				.addAbility(EAbility.MAY_SETTLE_A_SECOND_MILITARY_PLANET_WITH_YOUR_UNUSED_MILITARY);

	}

}
