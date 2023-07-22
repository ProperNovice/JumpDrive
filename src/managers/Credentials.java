package managers;

import utils.Enums.RearrangeTypeEnum;
import utils.Vector2;

public enum Credentials {

	INSTANCE;

	public final String primaryStageTitle = "JavaFX", numbersImageViewColor = "black";
	public final boolean colliderVisibility = true;
	public final double gapBetweenBorders = 25, textHeight = 50,
			selectEventHandlerAbleDimension = 100, animationStep = 4;
	public Vector2 dFrame, dGapBetweenComponents, dGapBetweenComponentsLineCast;
	public Vector2 cTextPanel, cImageViewIndicator;
	public RearrangeTypeEnum rearrangeTypeEnumText = RearrangeTypeEnum.LINEAR;

	public Vector2 dCard;
	public Vector2 cHand;
	public double cardHeight;

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

		double cardRows = 4;

		this.cardHeight = this.dFrame.y;
		this.cardHeight -= 2 * this.gapBetweenBorders;
		this.cardHeight -= (cardRows - 1) * this.dGapBetweenComponents.y;
		this.cardHeight /= cardRows;

		System.out.println(this.cardHeight);

		// c hand

		x = this.gapBetweenBorders;
		y = this.dFrame.y;
		y -= this.gapBetweenBorders;
		this.cHand = new Vector2(x, y);

	}

}
