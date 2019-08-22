package com.archebu.archebu.service;

import com.archebu.archebu.converter.RoomConverter;
import com.archebu.archebu.domain.Room;
import com.archebu.archebu.exception.RoomIsNotFoundException;
import com.archebu.archebu.model.response.RoomDetail;
import com.archebu.archebu.repository.RoomRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class RoomServiceTest {
    @InjectMocks
    private RoomService roomService;

    @Mock
    private RoomRepository roomRepository;

    @Mock
    private RoomConverter roomConverter;

    @Test
    public void it_should_get_room_details_by_room_no() {
        //given
        Room room = new Room();
        RoomDetail roomDetail = new RoomDetail();
        given(roomRepository.findByNo(100)).willReturn(Optional.of(room));
        given(roomConverter.apply(room)).willReturn(roomDetail);

        //when
        RoomDetail response = roomService.getRoomDetails(100);

        //then
        assertThat(response).isEqualTo(roomDetail);
    }

    @Test
    public void it_should_return_room_is_not_found_exception_when_the_room_is_not_in_database() {
        //given

        //when
        RoomIsNotFoundException thrown = (RoomIsNotFoundException)  catchThrowable(() -> roomService.getRoomDetails(1));

        //then
        assertThat(thrown).isNotNull();
        verify(roomRepository).findByNo(1);
        verifyZeroInteractions(roomConverter);
    }
}