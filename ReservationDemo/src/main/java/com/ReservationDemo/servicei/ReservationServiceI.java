package com.ReservationDemo.servicei;

import java.util.List;

import com.ReservationDemo.model.Reservation;

public interface ReservationServiceI {

	public void saveData(Reservation r);

	public List<Reservation> getAllData();

	public Reservation getByName(String rname);

	public Reservation getByAge(int age);

	public List<Reservation> getByGender(String gender);

	public Reservation getByEmail(String email);

}
