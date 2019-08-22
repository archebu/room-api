package com.archebu.archebu.controller;


import com.archebu.archebu.model.response.RoomDetail;
import com.archebu.archebu.service.RoomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = RoomController.class)
public class RoomControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RoomService roomservice;

    @Test
    public void it_should_get_room_details_by_room_no() throws Exception {
        //given
        RoomDetail roomDetail = new RoomDetail(100, 2000, "kahvalti");
        given(roomservice.getRoomDetails(100)).willReturn(roomDetail);

        //when
        ResultActions resultActions = mockMvc.perform(get("/room-info/100"));

        //then
        resultActions.andExpect(status().isOk());
        verify(roomservice).getRoomDetails(100);
    }
}