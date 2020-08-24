package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import entities.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long>, JpaSpecificationExecutor<Parking> {


}
