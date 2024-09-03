package com.ssg.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository //스프링 컨테이너가 역할 인지하게끔 해주는 어노테이션
@Qualifier("event")
public class EventSampleDAOImpl implements SampleDAO{
    //SampleDAOImpl에는 @Repository를 이용해서 해당 클래스의 객체를 스프링의 객체.
    // 즉, Bean으로 처리되도록 한다.
}
