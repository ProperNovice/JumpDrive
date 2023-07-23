package cards;

import enums.EAbility;

public class TradePact extends Card {

	public TradePact() {

		super.cardModel.setCost(1).setExplore(1).setPointsDefault(1).setCardsToDrawDefault(1)
				.addAbility(EAbility.MUST_HAVE_0_MILITARY_OR_CONTACT_SPECIALIST_TO_PLACE)
				.addAbility(EAbility.LIMIT_1_PER_PLAYER);

	}

}
