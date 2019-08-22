package com.archebu.archebu.exception;

public class RoomIsNotFoundException extends  RuntimeException {
    public RoomIsNotFoundException(Integer roomNo) { super ("Room is not found by this room no : " + roomNo);}
}
