package cards;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import enums.EAbility;
import utils.ArrayList;
import utils.Logger;

public class CardModel {

	private boolean isDevelopment = false, isPlanet = false;
	private int pointsDefault = 0, cardsToDrawDefault = 0, cost = 0;
	private Callable<Integer> pointsExtra = null, cardsToDrawExtra = null;
	private ExecutorService executorService = Executors.newFixedThreadPool(1);
	private ArrayList<EAbility> listAbilities = new ArrayList<>();

	public CardModel() {

	}

	public void print() {

		if (this.isDevelopment)
			Logger.INSTANCE.log("development");
		if (this.isPlanet)
			Logger.INSTANCE.log("planet");

		Logger.INSTANCE.log("cost - " + this.cost);
		Logger.INSTANCE.log("points - " + getPoints());
		Logger.INSTANCE.log("cards to draw - " + getCardsToDraw());

		if (!this.listAbilities.isEmpty())
			for (EAbility eAbility : this.listAbilities)
				Logger.INSTANCE.log(eAbility);

	}

	public void addAbility(EAbility eAbility) {
		this.listAbilities.addLast(eAbility);
	}

	public int getCost() {
		return this.cost;
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

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean hasAbility(EAbility eAbility) {
		return this.listAbilities.contains(eAbility);
	}

}
