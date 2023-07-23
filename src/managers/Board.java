package managers;

import cards.Card;
import listCredentials.Board0;
import listCredentials.Board1;
import listCredentials.Board2;
import listCredentials.Board3;
import listCredentials.Board4;
import listCredentials.Board5;
import listCredentials.Board6;
import listCredentials.Board7;
import utils.HashMap;
import utils.ListImageViewAbles;

public enum Board {

	INSTANCE;

	private HashMap<Integer, ListImageViewAbles<Card>> list = new HashMap<>();

	private Board() {
		createBoard();
	}

	public void createBoard() {

		this.list.put(0, new ListImageViewAbles<>(Board0.class));
		this.list.put(1, new ListImageViewAbles<>(Board1.class));
		this.list.put(2, new ListImageViewAbles<>(Board2.class));
		this.list.put(3, new ListImageViewAbles<>(Board3.class));
		this.list.put(4, new ListImageViewAbles<>(Board4.class));
		this.list.put(5, new ListImageViewAbles<>(Board5.class));
		this.list.put(6, new ListImageViewAbles<>(Board6.class));
		this.list.put(7, new ListImageViewAbles<>(Board7.class));

	}

}
