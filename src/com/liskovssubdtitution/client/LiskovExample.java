package com.liskovssubdtitution.client;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.liskovssubstitution.clubreservation.MultiDaysReservation;
import com.liskovssubstitution.clubreservation.SingleDayReservation;
import com.liskovssubstitution.clubreservation.Impl.*;

public class LiskovExample {

	public static void main(String[] args) {
		
		MultiDaysReservation roomReservation = new RoomReservation(LocalDate.of(2020, 6, 1), LocalDate.of(2020, 6, 15), LocalTime.of(15, 0), LocalTime.of(12, 30));
		SingleDayReservation golfReservation = new GolfReservation(LocalDate.of(2020, 7, 5), LocalTime.of(9, 30), LocalTime.of(9, 50));
		int noOfDays = roomReservation.calculateSpan().intValue();
		int noOfMinutes = golfReservation.calculateSpan().intValue();
	}

}
