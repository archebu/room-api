package com.archebu.archebu.converter;

import com.archebu.archebu.domain.Room;
import com.archebu.archebu.model.response.RoomDetail;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {
    public RoomDetail apply(Room room) {
        RoomDetail roomDetail = new RoomDetail();
        roomDetail.setRoomCapacity(room.getCapacity());
        roomDetail.setRoomNo(room.getNo());
        roomDetail.setRoomType(room.getType());
        return roomDetail;
    }
}
