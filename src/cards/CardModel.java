package cards;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CardModel {

	private boolean isDevelopment = false, isPlanet = false;
	private int pointsDefault = 0, cardsToDrawDefault = 0;
	private Callable<Integer> pointsExtra = null, cardsToDrawExtra = null;
	private ExecutorService executorService = Executors.newFixedThreadPool(1);

	public CardModel() {

	}

	public int getPoints() {

		int points = this.pointsDefault;

		if (this.pointsExtra != null)

			try {

				points += this.executorService.submit(this.pointsExtra).get();

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

		return points;

	}

	public int getCardsToDraw() {

		int cardsToDraw = this.cardsToDrawDefault;

		if (this.cardsToDrawExtra != null)

			try {

				cardsToDraw += this.executorService.submit(this.cardsToDrawExtra).get();

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

		return cardsToDraw;

	}

	public boolean isDevelopment() {
		return this.isDevelopment;
	}

	public boolean isPlanet() {
		return this.isPlanet;
	}

	public void setIsDevelopment() {
		this.isDevelopment = true;
	}

	public void setIsPlanet() {
		this.isPlanet = true;
	}

	public void setPointsDefault(int pointsDefault) {
		this.pointsDefault = pointsDefault;
	}

	public void setCardsToDrawDefault(int cardsToDrawDefault) {
		this.cardsToDrawDefault = cardsToDrawDefault;
	}

	public void setPointsExtra(Callable<Integer> pointsExtra) {
		this.pointsExtra = pointsExtra;
	}

	public void setCardsToDrawExtra(Callable<Integer> cardsToDrawExtra) {
		this.cardsToDrawExtra = cardsToDrawExtra;
	}

}
