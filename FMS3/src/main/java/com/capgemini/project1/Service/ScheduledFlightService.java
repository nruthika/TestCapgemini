package com.capgemini.project1.Service;

import com.capgemini.project1.Model.*;
import com.capgemini.project1.dao.*;
import com.capgemini.project1.UI.*;

import java.math.BigInteger;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import com.capgemini.project1.dao.*;
import com.capgemini.project1.Service.*;
import com.capgemini.project1.dao.*;

public interface ScheduledFlightService {
	
	public int scheduleFlight(ScheduledFlight sf);
	public ScheduledFlight viewScheduledFlights(int id);
	public List<ScheduledFlight> viewScheduledFlight();
	 public ScheduledFlight modifyScheduledFlight(int f,ScheduledFlight sfdto,int i)throws ParseException;
	 public void deleteScheduledFlight(int flightno);
	
	
	
	
	
	

}
