package com.capgemini.project1.Service;

import com.capgemini.project1.dao.*;
import com.capgemini.project1.Model.*;
import com.capgemini.project1.UI.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ScheduledFlightServiceImpl implements ScheduledFlightService
{

	public int scheduleFlight(ScheduledFlight sf) {
		ScheduledFlightDaoImpl sfDao = new ScheduledFlightDaoImpl();
		int updatecount = sfDao.scheduleFlight(sf);
		return updatecount;
	}

	public ScheduledFlight viewScheduledFlights(int id) {
		ScheduledFlightDaoImpl sfDao = new ScheduledFlightDaoImpl();
		ScheduledFlight sfbean = sfDao.viewScheduledFlights(id);
		return sfbean;
	}

	public List<ScheduledFlight> viewScheduledFlight() {
		ScheduledFlightDaoImpl sfDao = new ScheduledFlightDaoImpl();
		List list = sfDao.viewScheduledFlight();
		return list;
	}

	
	  public ScheduledFlight modifyScheduledFlight(int f,ScheduledFlight sfdto,int i)throws ParseException
	  {
		  ScheduledFlightDaoImpl sfDao = new ScheduledFlightDaoImpl();
		  ScheduledFlight sfbean=sfDao.modifyScheduledFlight(f, sfdto, i);
		  return sfbean;
	  }
	 

	public void deleteScheduledFlight(int flightno) {
		ScheduledFlightDaoImpl sfDao1 = new ScheduledFlightDaoImpl();
		sfDao1.deleteScheduledFlight(flightno);

	}
	

	

}
