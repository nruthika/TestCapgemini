package com.capgemini.project1.dao;

import com.capgemini.project1.Model.*;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import com.capgemini.project1.Service.*;
import com.capgemini.project1.UI.*;
public interface ScheduledFlightDao {
	
	public int scheduleFlight(ScheduledFlight flight);
	public ScheduledFlight viewScheduledFlights(int flightId);
	public List<ScheduledFlight> viewScheduledFlight();
	 public ScheduledFlight modifyScheduledFlight(int flight,ScheduledFlight sfdto,int i)throws ParseException;
	 public void deleteScheduledFlight(int flightno);
	
	
	
	

}
