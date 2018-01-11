package com.dewing.adam.assignment1;

/**
 * This abstract class will be the template for storing position data.
 * @author adam v dewing
 *
 */
public abstract class Position {
	protected String cardinal;
	protected int degree;
	protected int minute;
	
	/**
	 * Get the cardinal of the position
	 * @return
	 */
	public abstract String getCardinal();
	
	/**
	 * Set the cardinal of the position
	 * @param cardinal
	 */
	public abstract void setCardinal(String cardinal);
	
	/**
	 * Gets the degree of the position
	 * @return
	 */
	public abstract int getDegree();
	
	/**
	 * Sets the degree of the position 
	 * @param degree
	 */
	public abstract void setDegree(int degree);
	
	/**
	 * Gets the minute of the position
	 * @return
	 */
	public abstract int getMinute();
	
	/**
	 * Sets the minute of the position
	 * @param minute
	 */
	public abstract void setMinute(int minute);
}
