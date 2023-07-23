package managers;

import utils.Enums.RearrangeTypeEnum;
import utils.Vector2;

public enum Credentials {

	INSTANCE;

	public final String primaryStageTitle = "Jump Drive", numbersImageViewColor = "black";
	public final boolean colliderVisibility = true;
	public final double gapBetweenBorders = 25, textHeight = 50,
			selectEventHandlerAbleDimension = 100, animationStep = 4;
	public Vector2 dFrame, dGapBetweenComponents, dGapBetweenComponentsLineCast;
	public Vector2 cTextPanel, cImageViewIndicator;
	public RearrangeTypeEnum rearrangeTypeEnumText = RearrangeTypeEnum.LINEAR;

	private Vector2 dCardOriginal;
	public Vector2 dCard;
	public Vector2 cHand, cBoard;

	private Credentials() {

		double x = 0, y = 0;

		this.dFrame = new Vector2(1920, 1368);
		this.dGapBetweenComponents = new Vector2(4, 4);
		this.dGapBetweenComponentsLineCast = this.dGapBetweenComponents;

		// c text panel

		this.cTextPanel = new Vector2(x, y);

		// c image view indicator

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cImageViewIndicator = new Vector2(x, y);

		// d card

		this.dCardOriginal = new Vector2(238, 330);

		double cardRows = 4;

		y = this.dFrame.y;
		y -= 2 * this.gapBetweenBorders;
		y -= (cardRows - 1) * this.dGapBetweenComponents.y;
		y /= cardRows;
		x = this.dCardOriginal.x * y / this.dCardOriginal.y;

		this.dCard = new Vector2(x, y);

		// c hand

		x = this.gapBetweenBorders;
		y = this.dFrame.y;
		y -= this.gapBetweenBorders;
		this.cHand = new Vector2(x, y);

		// c board

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cBoard = new Vector2(x, y);

	}

}
