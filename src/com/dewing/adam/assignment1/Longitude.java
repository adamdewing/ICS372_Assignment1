package com.dewing.adam.assignment1;

/**
 * This class will store longitude data. This data will consist of a cardinal
 * (ie "E" or "W"), a degree, and minute.
 * 
 * @author adamv
 *
 */
public class Longitude extends Position {
	private static final int MIN_DEGREE = 0;
	private static final int MAX_DEGREE = 180;

	public void Longitude(int degree, int minute, String eastOrWest) {
		setDegree(degree);
		setMinute(minute);
		setCardinal(eastOrWest);
	}
	
	@Override
	public String getCardinal() {
		return cardinal;
	}

	/**
	 * Sets the cardinal (direction) of the Longitude.  Valid acceptable values are either "E" or "W".
	 */
	@Override
	public void setCardinal(String cardinal) {
		if (cardinal.equalsIgnoreCase("E")) {
			this.cardinal = "E";
		} else if (cardinal.equalsIgnoreCase("W")) {
			this.cardinal = "W";
		} else {
			this.cardinal = "";
		}
	}

	@Override
	public int getDegree() {
		return degree;
	}

	/**
	 * Sets the degree of the Longitude.  Valid acceptable values are between 0 and 180, inclusive.
	 */
	@Override
	public void setDegree(int degree) {
		if (degree >= MIN_DEGREE && degree <= MAX_DEGREE) {
			this.degree = degree;
		}
	}

	@Override
	public int getMinute() {
		return minute;
	}

	/**
	 * Sets the minute of the Longitude.  Valid acceptable values are between 0 and 60, inclusive.
	 */
	@Override
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 60) {
			this.minute = minute;
		}
	}

}
