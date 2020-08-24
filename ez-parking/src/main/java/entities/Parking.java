package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PARKING")
public class Parking {
	
	public enum StatusType {free, busy;}
	
	public enum PlaceType {standard, kw20, kw30;}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private PlaceType placeType;
	
	private String location;
	@Column(nullable = true)
	private long carId;
	@Column(nullable = true)
	private StatusType status;
	@Column(nullable = true)
	private Date checkIn;
	@Column(nullable = true)
	private Date checkOut;
	
	
	public Parking() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public PlaceType getPlaceType() {
		return placeType;
	}


	public void setPlaceType(PlaceType placeType) {
		this.placeType = placeType;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public long getCarId() {
		return carId;
	}


	public void setCarId(long carId) {
		this.carId = carId;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	


	public StatusType getStatus() {
		return status;
	}


	public void setStatus(StatusType status) {
		this.status = status;
	}


	public Parking(PlaceType placeType, String location) {
		super();
		this.placeType = placeType;
		this.location = location;
			}


	public Parking(PlaceType placeType, String location, long carId, StatusType status, Date checkIn, Date checkOut) {
		super();
		this.placeType = placeType;
		this.location = location;
		this.carId = carId;
		this.status = status;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	


	@Override
	public String toString() {
		return "Parking [id=" + id + ", placeType=" + placeType + ", location=" + location + ", carId=" + carId
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	
	

}
