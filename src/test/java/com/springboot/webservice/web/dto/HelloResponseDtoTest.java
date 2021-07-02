package com.springboot.webservice.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class HelloResponseDtoTest {
    @Test
    public void lombokTest(){
        //given
        String name = "test";
        int amount = 10;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
