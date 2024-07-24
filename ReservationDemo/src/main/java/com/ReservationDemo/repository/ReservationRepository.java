package com.ReservationDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ReservationDemo.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

	@Query(value="from Reservation where rname=:rname")
	public Reservation getDataByName(String rname);

	@Query(value="from Reservation where age=:age")
	public Reservation getDataByAge(int age);

	@Query(value="from Reservation where gender=?1")
	public List<Reservation> getDataByGender(String gender);

	@Query(value="from Reservation where email=?1")
	public Reservation getDataByEmail(String email);

}
