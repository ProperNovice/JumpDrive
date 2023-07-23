package listCredentials;

import managers.Credentials;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.Vector2;

public abstract class BoardList extends ListCredentials {

	public BoardList() {

		super.objectsPerRow = 1;
		super.relocateTypeEnum = RelocateTypeEnum.CENTER;
		super.rearrangeTypeEnum = RearrangeTypeEnum.PIVOT;

		// coordinates list

		double x = Credentials.INSTANCE.cBoard.x;
		x += getIndex()
				* (Credentials.INSTANCE.dCard.x + Credentials.INSTANCE.dGapBetweenComponents.x);

		double y = Credentials.INSTANCE.cBoard.y;

		super.coordinatesList = new Vector2(x, y);

	}

	protected abstract int getIndex();

}
