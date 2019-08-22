package com.archebu.archebu.service;

import com.archebu.archebu.converter.RoomConverter;
import com.archebu.archebu.domain.Room;
import com.archebu.archebu.exception.RoomIsNotFoundException;
import com.archebu.archebu.model.response.RoomDetail;
import com.archebu.archebu.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final RoomConverter roomConverter;
    public RoomDetail getRoomDetails(Integer roomNo) {
        Optional<Room> room = roomRepository.findByNo(roomNo);
        if(!room.isPresent()) {
            throw new RoomIsNotFoundException(roomNo);
        }
        return roomConverter.apply(room.get());
    }
}
