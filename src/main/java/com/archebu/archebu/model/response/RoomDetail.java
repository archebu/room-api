package com.archebu.archebu.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetail {
    private Integer roomNo;
    private Integer roomCapacity;
    private String roomType;
}
