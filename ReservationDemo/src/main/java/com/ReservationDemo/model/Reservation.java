package com.ReservationDemo.model;

import java.util.Date;
import java.sql.Time;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private String rname;
	private long contact;
	private String email;
	private int age;
	private String gender;
	@Temporal(TemporalType.DATE)
	private Date reservationDate;
	@Temporal(TemporalType.TIME)
	private Time reservationTime;
	 
	


}
