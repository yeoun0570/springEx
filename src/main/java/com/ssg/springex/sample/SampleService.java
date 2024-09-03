package com.ssg.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //스프링 컨테이너가 역할 인지하게끔 해주는 어노테이션
@ToString
public class SampleService {

    @Autowired
    private SampleDAO sampleDAO;

}
