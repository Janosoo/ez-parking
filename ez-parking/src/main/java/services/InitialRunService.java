package services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Parking;
import entities.Parking.PlaceType;
import entities.Parking.StatusType;
import repositories.ParkingRepository;

@Service
public class InitialRunService {
	
	@Autowired 
	private ParkingRepository parkingRepository;
	
	@Transactional
	public void inserts() {
		
		parkingRepository.saveAndFlush(new Parking(PlaceType.standard, "1A", 1L, StatusType.free, new java.util.Date(), new java.util.Date()));
	}

}
