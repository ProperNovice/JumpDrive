package cards;

import managers.Credentials;
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
		getImageView().setDimensions(Credentials.INSTANCE.dCard);

	}

	public final void print() {

		Logger.INSTANCE.logNewLine("*/");

		Logger.INSTANCE.logNewLine(this.getClass().getSimpleName());
		this.cardModel.print();

		Logger.INSTANCE.newLine();
		Logger.INSTANCE.logNewLine("/*");

	}

	public final CardModel getCardModel() {
		return this.cardModel;
	}

}
