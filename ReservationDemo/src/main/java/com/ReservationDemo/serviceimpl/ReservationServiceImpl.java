package com.ReservationDemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReservationDemo.model.Reservation;
import com.ReservationDemo.repository.ReservationRepository;
import com.ReservationDemo.servicei.ReservationServiceI;

@Service
public class ReservationServiceImpl implements ReservationServiceI{

	@Autowired private ReservationRepository rr;

	@Override
	public void saveData(Reservation r)
	{
		rr.save(r);
		
	}

	@Override
	public List<Reservation> getAllData()
	{
		
		return rr.findAll();
	}

	@Override
	public Reservation getByName(String rname)
	{
		
		return rr.getDataByName(rname);
	}

	@Override
	public Reservation getByAge(int age)
	{
		
		return rr.getDataByAge(age);
	}

	@Override
	public List<Reservation> getByGender(String gender) 
	{
		
		return rr.getDataByGender(gender);
	}

	@Override
	public Reservation getByEmail(String email)
	{
		return rr.getDataByEmail(email);
	}
	
	
}
