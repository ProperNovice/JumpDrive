package cards;

import enums.EAbility;

public class ContactSpecialist extends Card {

	public ContactSpecialist() {

		super.cardModel.setCost(1).setIsDevelopment().setExplore(1).setPointsDefault(1).addAbility(
				EAbility.MAY_PLACE_A_NON_ALIEN_MILITARY_PLANET_AS_A_NON_MILITARY_AT_MINUS_1_COST);

	}

}
