package cards;

import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Logger;

public abstract class Card implements IImageViewAble {

	protected CardModel cardModel = new CardModel();

	public Card() {

		createImageView();

		// height 330

	}

	private void createImageView() {

		String fileName = "cards/";
		fileName += this.getClass().getSimpleName();
		fileName += ".png";
		new ImageView(fileName, this);

	}

	public final void print() {

		Logger.INSTANCE.logNewLine("*/");

		Logger.INSTANCE.logNewLine(this.getClass().getSimpleName());
		this.cardModel.print();

		Logger.INSTANCE.newLine();
		Logger.INSTANCE.log("/*");

	}

}
