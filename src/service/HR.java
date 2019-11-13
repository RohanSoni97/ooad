package service;

import Singleton.JobSingleton;
import model.Candidate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HR {
    String hr_id;
    String hr_name;
    SkillSet skillSet;
    JobOffer jobOffer;
    List<Candidate> candidateList;
    public String getHr_id() {
        return hr_id;
    }

    public void setHr_id(String hr_id) {
        this.hr_id = hr_id;
    }

    public String getHr_name() {
        return hr_name;
    }

    public void setHr_name(String hr_name) {
        this.hr_name = hr_name;
    }
    public void shortListCandidate()
    {
       //service.Job job =new service.Job();
       //candidateList=new ArrayList<>();
       //candidateList= job.getCandidateList();
    }
    public void emailShortListedCandidate()
    {

    }
    public void getCandidateSkillSet()
    {
        HashMap<String, List<String>> map = new HashMap<>();
        skillSet=new SkillSet();
        map=skillSet.getCandidateSkill();

        for (String key : map.keySet())
        {
            System.out.println("Candidate Id : "+key);
            for (String value : map.get(key))
            {
                System.out.println(value);
            }
            System.out.println("---------------------------------------");
        }
    }
    public void postJob()
    {

        Job job= JobSingleton.objectJob();
        Job jobs[]=new Job[3];
        String input="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Job Desc ...");
        input=scanner.nextLine();
        for (int i=0;i<jobs.length;i++)
        {
            jobs[i]=new Job(i+" ",input);
            job.addJobs(jobs[i]);
            if(i != jobs.length-1)
            input=scanner.nextLine();
        }


    }
    public void getCandidateList()
    {
      Job job=JobSingleton.objectJob();
      candidateList=new ArrayList<>();
      candidateList=job.getCandidateList();
      for(Candidate c : candidateList)
      {
          System.out.println("Job Id : "+c.getJob().getJob_id()+" Candidate Id : "+c.getCandidate_id());
            skillSet=new SkillSet();
            skillSet.getCandidateSkills(c.getCandidate_id());
      }
    }



}
