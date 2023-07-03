package com.example.urine.SAMPLE;

public class sampleClass {
    private String FirstName;
    private String family_name;
    private int age;

    public String getFirstName() {
        if (FirstName.equals("suzuki")) {
            return FirstName;
        } else if (FirstName.equals("takahashi")) {
            return FirstName;
        } else return null;
    }

    public String getFamily_name() {
        return family_name;
    }

    public int getAge() {
        return age;
    }
}
