package listCredentials;

import managers.Credentials;

public class Board extends ListCredentials {

	public Board() {

		super.objectsPerRow = 8;
		super.coordinatesList = Credentials.INSTANCE.cBoard;

	}

}
