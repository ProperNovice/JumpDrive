package listCredentials;

import managers.Credentials;
import utils.Enums.RelocateTypeEnum;

public class Hand extends ListCredentials {

	public Hand() {

		super.coordinatesList = Credentials.INSTANCE.cHand;
		super.relocateTypeEnum = RelocateTypeEnum.BOTTOM_LEFT;

	}

}
