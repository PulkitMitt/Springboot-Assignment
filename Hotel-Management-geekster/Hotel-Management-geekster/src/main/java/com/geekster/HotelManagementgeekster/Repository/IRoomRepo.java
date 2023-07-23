package com.geekster.HotelManagementgeekster.Repository;

import com.geekster.HotelManagementgeekster.Model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom, Long> {
}





