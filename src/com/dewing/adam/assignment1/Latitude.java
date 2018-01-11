package com.dewing.adam.assignment1;

/**
 * This class will store latitude data. This data will consist of a cardinal
 * (ie "N" or "S"), a degree, and minute.
 * 
 * @author adamv
 *
 */
public class Latitude extends Position {
	private static final int MIN_DEGREE = 0;
	private static final int MAX_DEGREE = 90;
	
	public Latitude(int degree, int minute, String northOrSouth) {
		setDegree(degree);
		setMinute(minute);
		setCardinal(northOrSouth);
	}
	
	@Override
	public String getCardinal() {
		return cardinal;
	}

	/**
	 * Sets the cardinal (direction) of the latitude.  Valid acceptable values are either "N" or "S".
	 */
	@Override
	public void setCardinal(String cardinal) {
		if(cardinal.equalsIgnoreCase("N")) {
			this.cardinal = "N";
		}else if(cardinal.equalsIgnoreCase("S")) {
			this.cardinal = "S";
		}else {
			this.cardinal = "";
		}
	}
	
	@Override
	public int getDegree() {
		return degree;
	}
	
	/**
	 * Sets the degree of the Latitude.  Valid acceptable values are between 0 and 90, inclusive.
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
	 * Sets the minute of the Latitude.  Valid acceptable values are between 0 and 60, inclusive.
	 */
	@Override
	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 60) {
			this.minute = minute;
		}
	}


}
