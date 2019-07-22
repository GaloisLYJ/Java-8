package com.java8.enums;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class EnumsTest {
    @Test
    public void getName(){
        log.info( "getName():{}", Color.getName(3) );
        log.info( "get set: {}", Color.BLANK.getName() );
        log.info("get set: {}", Color.BLANK.getIndex() );



        System.out.println(Color.BLANK.name());
        //BLANK

        System.out.println(Color.getName(3));
        //白色

        System.out.println(Color.BLANK.getName());
        //白色

        System.out.println(Color.BLANK.valueOf("BLANK"));
        //BLANK

        List<Color> list = Arrays.asList(Color.values());
        list.stream().forEach(e -> e.getName());
        //""

        List<Color> list2 = Arrays.asList(Color.BLANK.values());
        list2.stream().forEach(e -> e.getName());
        //""

        System.out.println(Color.BLANK.getIndex());
        //3
    }
}
