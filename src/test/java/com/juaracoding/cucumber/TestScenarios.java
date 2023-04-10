package com.juaracoding.cucumber;

public enum TestScenarios {
    T1("User succesful Login into web HRM"),
    T2("Admin go to Recruitment page");

    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
