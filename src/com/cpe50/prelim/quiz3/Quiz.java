package com.prelim.salvio;

public class Quiz {
	private double rawScore, totalScore;
	
	

	public double getRawScore() {
		return rawScore;
	}



	public void setRawScore(double rawScore) {
		this.rawScore = rawScore;
	}



	public double getTotalScore() {
		return totalScore;
	}



	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}



	public Quiz(double rawScore, double totalScore) {
		super();
		this.rawScore = rawScore;
		this.totalScore = totalScore;
	}
}
