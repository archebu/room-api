package com.archebu.archebu.converter;

import com.archebu.archebu.domain.Room;
import com.archebu.archebu.model.response.RoomDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class RoomConverterTest {
    @InjectMocks
    private RoomConverter roomConverter;

    @Test
    public void it_should_apply() {
        //given
        Room room = new Room();

        //when
        RoomDetail response = roomConverter.apply(room);

        //then
        assertThat(response.getRoomCapacity()).isEqualTo(room.getCapacity());
    }
}