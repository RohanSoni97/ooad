package service;

import model.Candidate;

public class Interviewer {
    String interviewer_id;
    String interview_name;
    Candidate candidate;
    public String getInterviewer_id() {
        return interviewer_id;
    }

    public void setInterviewer_id(String interviewer_id) {
        this.interviewer_id = interviewer_id;
    }

    public String getInterview_name() {
        return interview_name;
    }

    public void setInterview_name(String interview_name) {
        this.interview_name = interview_name;
    }
    public void takeInterview()
    {

    }
    public int status()
    {
        return 0;
    }

}
