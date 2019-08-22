package com.archebu.archebu.repository;

import com.archebu.archebu.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository  extends CrudRepository<Room, Integer> {
     Optional<Room> findByNo(int i);
}
