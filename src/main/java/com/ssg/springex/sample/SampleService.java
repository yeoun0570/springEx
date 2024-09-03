package com.ssg.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //스프링 컨테이너가 역할 인지하게끔 해주는 어노테이션
@ToString
@RequiredArgsConstructor // 생성자 주입 방식
public class SampleService {

    @Qualifier("basic") //@Qualifier("event")
    private final SampleDAO sampleDAO;
}
