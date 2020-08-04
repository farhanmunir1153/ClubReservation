package com.liskovssubstitution.clubreservation.Impl;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import com.liskovssubstitution.clubreservation.SingleDayReservation;

public class GolfReservation extends SingleDayReservation{

	public GolfReservation(LocalDate reservationDate, LocalTime startTime, LocalTime endTime){
		super(reservationDate, startTime, endTime);		
	}
	
	@Override
	public Long calculateSpan() {
		return Duration.between(this.startTime, this.endTime).get(ChronoUnit.MINUTES);
	}

}
