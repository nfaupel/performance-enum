package com.signavio.performance.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PerformanceEntityRepository extends CrudRepository<PerformanceEntity, Long> {

    List<PerformanceEntity> getAllByPerformanceEnumString(PerformanceEnum selector);

    List<PerformanceEntity> getAllByPerformanceEnumStringIndexed(PerformanceEnum selector);

    List<PerformanceEntity> getAllByPerformanceEnumOrdinal(PerformanceEnum selector);
    
    List<PerformanceEntity> getAllByPerformanceEnumOrdinalIndexed(PerformanceEnum selector);

}
