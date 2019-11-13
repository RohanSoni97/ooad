package service;

import Singleton.CandidateSingleton;
import model.Candidate;


import java.util.ArrayList;
import java.util.List;

public class Job {
    String job_id;
    String job_desc;

    List<Candidate> candidateList= CandidateSingleton.getCandidateList();

    public String getJob_id() {
        return job_id;
    }

    public Job(String job_id, String job_desc) {
        this.job_id = job_id;
        this.job_desc = job_desc;
    }
    public Job()
    {

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

    List<Job> jobs =new ArrayList<>();

    public void applyJob(Candidate candidate)
    {
        candidateList.add(candidate);
    }
    public List<Candidate> getCandidateList()
    {
        return candidateList;
    }

    public Job addJobs(Job job)
    {

            jobs.add(job);

        return jobs.get(0);
    }

    public List<Job> getJobs()
    {
        return jobs;
    }

}
