package cards;

public class SpaceMarines extends Card {

	@Override
	protected void createCardModel() {

		super.cardModel.setIsDevelopment().setCost(2).setMilitaryPlusValue(2);

	}

}
