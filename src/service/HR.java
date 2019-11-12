package service;

import model.Candidate;
import model.Skill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
       Job job=new Job();
       candidateList=new ArrayList<>();
       candidateList=job.getCandidateList();
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

}
