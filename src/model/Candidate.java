package model;

import Singleton.JobSingleton;
import service.Document;
import service.Job;
import service.SkillSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Candidate {
   String candidate_id;
   String candidate_name;
   SkillSet skillSet;
   Document document;
   List<Job> jobs;
    Job job =null;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Candidate(String candidate_id, String candidate_name) {
        this.candidate_id = candidate_id;
        this.candidate_name = candidate_name;

    }


    public String getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(String candidate_id) {
        this.candidate_id = candidate_id;
    }

    public String getCandidate_name() {
        return candidate_name;
    }

    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }
    public void applyJob(Candidate c)
    { int input=0;
        System.out.println("Enter Id No of job which you have or enter -1 to exit ::");
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextInt();
        jobs =new ArrayList<>();
        while (input != -1)
        {
            job =JobSingleton.objectJob();
            c.getJob().setJob_id(""+input);
            job.applyJob(c);
            input=scanner.nextInt();
        }

    }
    public HashMap<String, List<String>> addSkillSet() throws IOException {
        skillSet=new SkillSet();
       return skillSet.addSkills(this.candidate_id);
    }
    public void uploadDocument()
    {

    }
    public List<Job> getJobs()
    {
        jobs =new ArrayList<>();
         job = JobSingleton.objectJob();
        jobs = job.getJobs();
        return jobs;
    }
    @Override
    public String toString() {
        return "Job Id : "+ job.getJob_id()+" "+"Job Desc :"+ job.getJob_desc();
    }
}
