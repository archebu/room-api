package com.archebu.archebu.controller;

import com.archebu.archebu.model.response.RoomDetail;
import com.archebu.archebu.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping("/room-info/{roomNo}")
    @ResponseStatus(HttpStatus.OK)
    public RoomDetail getRoomDetails(@PathVariable Integer roomNo) {
        return roomService.getRoomDetails(roomNo);
    }
}
