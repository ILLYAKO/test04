package com.illya.web.domain;

public class ProblemType {
    private String problemTypeID;
    private String problemTypeShortName;
    private String problemTypeFullName;
    private String problemTypeDescription;

    public ProblemType() {    }

    public ProblemType(String problemTypeID, String problemTypeShortName,String problemTypeFullName, String problemTypeDescription) {
        this.problemTypeID = problemTypeID;
        this.problemTypeShortName = problemTypeShortName;
        this.problemTypeFullName = problemTypeFullName;
        this.problemTypeDescription = problemTypeDescription;
    }

    public String getProblemTypeID() {
        return problemTypeID;
    }

    public void setProblemTypeID(String problemTypeID) {
        this.problemTypeID = problemTypeID;
    }

    public String getProblemTypeShortName() {
        return problemTypeShortName;
    }

    public void setProblemTypeShortName(String problemTypeShortName) {
        this.problemTypeShortName = problemTypeShortName;
    }

    public String getProblemTypeFullName() {
        return problemTypeFullName;
    }

    public void setProblemTypeFullName(String problemTypeFullName) {
        this.problemTypeFullName = problemTypeFullName;
    }

    public String getProblemTypeDescription() {
        return problemTypeDescription;
    }

    public void setProblemTypeDescription(String problemTypeDescription) {
        this.problemTypeDescription = problemTypeDescription;
    }
}
