package service;

import model.Candidate;


import java.util.ArrayList;
import java.util.List;

public class Job {
    String job_id;
    String job_desc;
    List<Candidate> candidateList=null;
    List<Job> jobs=null;
    public Job()
    {
        candidateList=new ArrayList<>();
        jobs=new ArrayList<>();
    }
    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_desc() {
        return job_desc;
    }

    public void setJob_desc(String job_desc) {
        this.job_desc = job_desc;
    }
    public void applyJob(Candidate candidate)
    {
        candidateList.add(candidate);
    }
    public List<Candidate> getCandidateList()
    {
        return candidateList;
    }

    public void addJobs(Job job)
    {
        jobs.add(job);
    }

    public List<Job> getJobs()
    {
        return jobs;
    }

}
