package com.signavio.performance.persistence;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(indexes = {
        @Index(name = "performanceEnumStringIndexed", columnList = "performanceEnumStringIndexed"),
        @Index(name = "performanceEnumOrdinalIndexed", columnList = "performanceEnumOrdinalIndexed")
        })
public class PerformanceEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private PerformanceEnum performanceEnumString;

    @Enumerated(EnumType.STRING)
    private PerformanceEnum performanceEnumStringIndexed;

    @Enumerated(EnumType.ORDINAL)
    private PerformanceEnum performanceEnumOrdinal;
    
    @Enumerated(EnumType.ORDINAL)
    private PerformanceEnum performanceEnumOrdinalIndexed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerformanceEnum getPerformanceEnumString() {
        return performanceEnumString;
    }

    public void setPerformanceEnumString(PerformanceEnum performanceEnumString) {
        this.performanceEnumString = performanceEnumString;
    }

    public PerformanceEnum getPerformanceEnumStringIndexed() {
        return performanceEnumStringIndexed;
    }

    public void setPerformanceEnumStringIndexed(PerformanceEnum performanceEnumStringIndexed) {
        this.performanceEnumStringIndexed = performanceEnumStringIndexed;
    }

    public PerformanceEnum getPerformanceEnumOrdinal() {
        return performanceEnumOrdinal;
    }

    public void setPerformanceEnumOrdinal(PerformanceEnum performanceEnumOrdinal) {
        this.performanceEnumOrdinal = performanceEnumOrdinal;
    }
    
    public PerformanceEnum getPerformanceEnumOrdinalIndexed() {
        return performanceEnumOrdinalIndexed;
    }
    
    public void setPerformanceEnumOrdinalIndexed(
            PerformanceEnum performanceEnumOrdinalIndexed) {
        this.performanceEnumOrdinalIndexed = performanceEnumOrdinalIndexed;
    }
    
}
