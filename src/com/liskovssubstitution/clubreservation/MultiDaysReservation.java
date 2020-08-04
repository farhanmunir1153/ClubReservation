/**
 * 
 */
package com.liskovssubstitution.clubreservation;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author fmunir
 * @since 29/July/2020 09:01 PM
 */
public abstract class MultiDaysReservation {

	protected LocalDate reservationStartDate;
	protected LocalDate reservationEndDate;
	protected LocalTime startTime;
	protected LocalTime endTime;	
	
	public MultiDaysReservation(LocalDate reservationStartDate, LocalDate reservationEndDate, LocalTime startTime, LocalTime endTime) {
		this.reservationStartDate = reservationStartDate;
		this.reservationEndDate = reservationEndDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public LocalDate getReservationStartDate() {
		return reservationStartDate;
	}
	
	public LocalDate getReservationEndDate() {
		return reservationEndDate;
	}

	public void setReservationStartDate(LocalDate reservationDate) {
		this.reservationEndDate = reservationDate;
	}

	public void setReservationEndDate(LocalDate reservationDate) {
		this.reservationEndDate = reservationDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	public abstract Number calculateSpan();
	
}
