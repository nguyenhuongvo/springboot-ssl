package com.rabiloo.springbootssl.api;

import com.rabiloo.springbootssl.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping("/testSSL")
    public ResponseDto testSSL() {
        return new ResponseDto(200, "Success!");
    }
}
