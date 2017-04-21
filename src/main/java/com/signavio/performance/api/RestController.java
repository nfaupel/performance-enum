package com.signavio.performance.api;

import com.signavio.performance.persistence.PerformanceEntityRepository;
import com.signavio.performance.persistence.PerformanceEnum;
import com.signavio.performance.persistence.PerformanceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RestController {

    @Autowired
    private PerformanceEntityRepository performanceEntityRepository;
    
    // to stick with the REST standard this should be a POST,
    // but with a GET you can easily test the whole setup with the address bar of your browser
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public String create(@RequestParam(value = "count") int count) {

        List<PerformanceEntity> createList = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            PerformanceEntity entity = new PerformanceEntity();
            PerformanceEnum performanceEnum = PerformanceEnum.values()[i % 10];
            
            entity.setPerformanceEnumString(performanceEnum);
            entity.setPerformanceEnumStringIndexed(performanceEnum);
            entity.setPerformanceEnumOrdinal(performanceEnum);
            entity.setPerformanceEnumOrdinalIndexed(performanceEnum);
            
            createList.add(entity);
        }
        performanceEntityRepository.save(createList);

        return "created";
    }
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String get() {

        String result = "";
        for(int i = 0; i < 100; i++) {
            PerformanceEnum performanceEnum = PerformanceEnum.values()[i % 10];
    
            List<PerformanceEntity> results1 = performanceEntityRepository
                    .getAllByPerformanceEnumString(performanceEnum);
            List<PerformanceEntity> results2 = performanceEntityRepository
                    .getAllByPerformanceEnumStringIndexed(performanceEnum);
            List<PerformanceEntity> results3 = performanceEntityRepository
                    .getAllByPerformanceEnumOrdinal(performanceEnum);
            List<PerformanceEntity> results4 = performanceEntityRepository
                    .getAllByPerformanceEnumOrdinalIndexed(performanceEnum);
            result += results1.size() + " " + results2.size() + " " + results3.size() + " " + results4.size() + "\n";
        }
        return result;
    }
}
