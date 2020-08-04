package com.liskovssubstitution.clubreservation.Impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import com.liskovssubstitution.clubreservation.MultiDaysReservation;

public class RoomReservation extends MultiDaysReservation{

	
	public RoomReservation(LocalDate reservationStartDate, LocalDate reservationEndDate, LocalTime startTime, LocalTime endTime){
		super(reservationStartDate, reservationEndDate, startTime, endTime);		
		this.reservationEndDate = reservationEndDate;		
	}
	
	@Override
	public Integer calculateSpan() {		
		Period period = Period.between(this.reservationStartDate, this.reservationEndDate); 
		return period.getDays();
		
	}

}
