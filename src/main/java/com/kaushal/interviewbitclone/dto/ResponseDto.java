package com.kaushal.interviewbitclone.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
public class ResponseDto<T> {
    private HttpStatus statuscode;
    private T data;

    public ResponseDto(HttpStatus httpStatus,T data){
        this.statuscode = httpStatus;
        this.data = data;
    }

}
//DTO means data transfer object used to api return always contains dto object because while returning null it make
// break code of client or development team.
//It is good practise to use DTO
//other things may be return as server id- which sent response, timestamp, page offset