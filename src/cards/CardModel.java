package cards;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import enums.EAbility;
import enums.EColor;
import utils.ArrayList;
import utils.Logger;

public class CardModel {

	private boolean isDevelopment = false, isPlanet = false, isMilitary = false;
	private int pointsDefault = 0, cardsToDrawDefault = 0, cost = 0, explore = 0, militaryPlusValue = 0,
			chromosome = 0;
	private Callable<Integer> pointsExtra = null, cardsToDrawExtra = null;
	private EColor eColorPlanet = null;
	private ExecutorService executorService = Executors.newFixedThreadPool(1);
	private ArrayList<EAbility> listAbilities = new ArrayList<>();

	public CardModel() {

	}

	public boolean cardCredentialsAreValid() {

		if (this.isDevelopment || this.isPlanet)
			return true;
		else
			return false;

	}

	public void print() {

		if (this.isDevelopment)
			Logger.INSTANCE.log("development");
		if (this.isPlanet)
			Logger.INSTANCE.log("planet");

		Logger.INSTANCE.log("cost - " + this.cost);

		if (this.explore > 0)
			Logger.INSTANCE.log("explore - " + this.explore);

		if (this.militaryPlusValue > 0)
			Logger.INSTANCE.log("military plus value - " + this.militaryPlusValue);

		if (this.chromosome > 0)
			Logger.INSTANCE.log("chromosome - " + this.chromosome);

		if (getPoints() > 0)
			Logger.INSTANCE.log("points - " + getPoints());

		if (getCardsToDraw() > 0)
			Logger.INSTANCE.log("cards to draw - " + getCardsToDraw());

		if (!this.listAbilities.isEmpty())
			for (EAbility eAbility : this.listAbilities)
				Logger.INSTANCE.log(eAbility);

	}

	public CardModel setColorPlanet(EColor eColorPlanet) {
		this.eColorPlanet = eColorPlanet;
		return this;
	}

	public CardModel setMilitaryPlanet() {
		this.isMilitary = true;
		return this;
	}

	public CardModel addAbility(EAbility eAbility) {
		this.listAbilities.addLast(eAbility);
		return this;
	}

	public CardModel setIsDevelopment() {
		this.isDevelopment = true;
		return this;
	}

	public CardModel setIsPlanet() {
		this.isPlanet = true;
		return this;
	}

	public CardModel setPointsDefault(int pointsDefault) {
		this.pointsDefault = pointsDefault;
		return this;
	}

	public CardModel setCardsToDrawDefault(int cardsToDrawDefault) {
		this.cardsToDrawDefault = cardsToDrawDefault;
		return this;
	}

	public CardModel setPointsExtra(Callable<Integer> pointsExtra) {
		this.pointsExtra = pointsExtra;
		return this;
	}

	public CardModel setCardsToDrawExtra(Callable<Integer> cardsToDrawExtra) {
		this.cardsToDrawExtra = cardsToDrawExtra;
		return this;
	}

	public CardModel setCost(int cost) {
		this.cost = cost;
		return this;
	}

	public CardModel setExplore(int explore) {
		this.explore = explore;
		return this;
	}

	public CardModel setMilitaryPlusValue(int military) {
		this.militaryPlusValue = military;
		return this;
	}

	public CardModel setChromosome(int chromosome) {
		this.chromosome = chromosome;
		return this;
	}

	public boolean hasAbility(EAbility eAbility) {
		return this.listAbilities.contains(eAbility);
	}

	public boolean isDevelopment() {
		return this.isDevelopment;
	}

	public boolean isPlanet() {
		return this.isPlanet;
	}

	public int getCost() {
		return this.cost;
	}

	public int getExplore() {
		return this.explore;
	}

	public int getMilitaryPlusValue() {
		return this.militaryPlusValue;
	}

	public int getChromosome() {
		return this.chromosome;
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

	public boolean isMilitaryPlanet() {
		return this.isMilitary;
	}

	public boolean isColorPlanet(EColor eColorPlanet) {

		if (this.eColorPlanet == null)
			return false;
		else
			return this.eColorPlanet.equals(eColorPlanet);

	}

}
