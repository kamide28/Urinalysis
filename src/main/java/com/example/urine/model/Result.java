package com.example.urine.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Result {
    private Integer id;
    private String inspectorName;
    private String rbc;
    private String wbc;
    private String squamousEpithelial;
    private String urothelialEpithelial;
    private String renalTubularEpithelial;
    private String other;
    private String message;

    public Result(Integer id, String inspentorName, String rbc, String wbc, String squamousEpithelial,
                  String urothelialEpithelial, String renalTubularEpithelial, String other, String message) {
        this.id = id;
        this.inspectorName = inspentorName;
        this.rbc = rbc;
        this.wbc = wbc;
        this.squamousEpithelial = squamousEpithelial;
        this.urothelialEpithelial = urothelialEpithelial;
        this.renalTubularEpithelial = renalTubularEpithelial;
        this.other = other;
        this.message = message;
    }
}
