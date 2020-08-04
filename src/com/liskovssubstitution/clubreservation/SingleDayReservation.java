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
public abstract class SingleDayReservation {

	protected LocalDate reservationDate;
	protected LocalTime startTime;
	protected LocalTime endTime;	
	
	public SingleDayReservation(LocalDate reservationDate, LocalTime startTime, LocalTime endTime) {
		this.reservationDate = reservationDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
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
