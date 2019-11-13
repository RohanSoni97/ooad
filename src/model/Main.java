package model;

import service.HR;
import service.Job;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String []args) throws IOException {
        HashMap<String, List<String>> map = new HashMap<>();
        Candidate candidate=new Candidate("1","abc");
        map=candidate.addSkillSet();
        for (String key : map.keySet())
        {
            System.out.println("Candidate Id : "+key);
            for (String value : map.get(key))
            {
                System.out.println(value);
            }
            System.out.println("---------------------------------------");
        }
        HR hr=new HR();
        hr.postJob();
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        System.out.println("--------------------- Candidate Search for Jobs ---------------------");
        List<Job> jobs1 =candidate.getJobs();
        for (Job j:jobs1)
        {
            System.out.println("Job Id :"+j.getJob_id()+" Job Description :"+j.getJob_desc());
        }
        candidate.applyJob(candidate);
        hr.getCandidateList();
    }
}
