package com.ReservationDemo.controller;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.ReservationDemo.model.Reservation;
import com.ReservationDemo.servicei.ReservationServiceI;

@RestController
public class HomeController {

	@Autowired private ReservationServiceI rsi;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Reservation r)
	{
		r.setReservationDate(new Date());
		r.setReservationTime(new Time(System.currentTimeMillis()));
		rsi.saveData(r);
		return "Data Saved..";
		
	}
	
	@GetMapping("/getData")
	public ResponseEntity<List<Reservation>> getAllData()
	{
	    List<Reservation> rt = rsi.getAllData();
	    
	    return new ResponseEntity<List<Reservation>>(rt, HttpStatus.OK);	    		
	}
	
	@GetMapping("/getDatabyName/{rname}")
	public ResponseEntity<Reservation> getByName(@PathVariable String rname)
	{
	    Reservation rt = rsi.getByName(rname);
	    
	    return new ResponseEntity<Reservation>(rt, HttpStatus.OK);	    		
	}
	
	@GetMapping("/getDatabyAge/{age}")
	public ResponseEntity<Reservation> getByAge(@PathVariable int age)
	{
	    Reservation rt = rsi.getByAge(age);
	    
	    return new ResponseEntity<Reservation>(rt, HttpStatus.OK);	    		
	}
	
	@GetMapping("/getDatabyGender/{gender}")
	public ResponseEntity<List<Reservation>> getByGender(@PathVariable String gender)
	{
	    List<Reservation> rt = rsi.getByGender(gender);
	    
	    return new ResponseEntity<List<Reservation>>(rt, HttpStatus.OK);	    		
	}
	
	@GetMapping("/getDatabyEmail/{email}")
	public ResponseEntity<Reservation> getByEmail(@PathVariable String email)
	{
	    Reservation rt = rsi.getByEmail(email);
	    
	    return new ResponseEntity<Reservation>(rt, HttpStatus.OK);	    		
	}
	
	
	
	
	
}
