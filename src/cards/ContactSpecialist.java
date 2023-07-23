package cards;

import enums.EAbility;

public class ContactSpecialist extends Card {

	public ContactSpecialist() {

		super.cardModel.setCost(1);
		super.cardModel.setIsDevelopment();
		super.cardModel.setPointsDefault(1);
		super.cardModel.addAbility(
				EAbility.MAY_PLACE_A_NON_ALIEN_MILITARY_PLANET_AS_A_NON_MILITARY_AT_MINUS_ONE_COST_NYI);

	}

}
