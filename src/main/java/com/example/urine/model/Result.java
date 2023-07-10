package com.example.urine.model;

public class Result {
    private Integer id;
    private String inspentorName;
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
        this.inspentorName = inspentorName;
        this.rbc = rbc;
        this.wbc = wbc;
        this.squamousEpithelial = squamousEpithelial;
        this.urothelialEpithelial = urothelialEpithelial;
        this.renalTubularEpithelial = renalTubularEpithelial;
        this.other = other;
        this.message = message;
    }
}
