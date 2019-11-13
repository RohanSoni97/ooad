package service;

import Singleton.SkillSetSingelton;
import model.Skill;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SkillSet {
    String skill_set_id;
    String skill_id;
    String candid_id;
    List<Skill> skills=null;
    Skill skill=new Skill();
    List<SkillSet> skillSets=null;
    HashMap<String, List<String>> map = SkillSetSingelton.getHashObject();

    public String getSkill_set_id() {
        return skill_set_id;
    }

    public void setSkill_set_id(String skill_set_id) {
        this.skill_set_id = skill_set_id;
    }

    public String getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }

    public String getCandid_id() {
        return candid_id;
    }

    public void setCandid_id(String candid_id) {
        this.candid_id = candid_id;
    }

    public HashMap<String, List<String>> addSkills(String candid_id) throws IOException {
        String skillName=null;
        skills=new ArrayList<>();
        skills=skill.getSkills();
        System.out.println(skills);
        System.out.println("Enter skill Name  of skill which you have or enter -1 to exit ::");
        Scanner scanner=new Scanner(System.in);
        skillName=scanner.nextLine();
        skillSets=new ArrayList<>();
        List<String> list=new ArrayList<>();
        while (!skillName.equals("-1"))
        {
            list.add(skillName);
            skillName=scanner.nextLine();
        }
        map.put(candid_id,list);
        return map;
    }
    public HashMap<String, List<String>> getCandidateSkill()
    {
        return map;
    }

    @Override
    public String toString() {
        return " "+skill.getSkill_id()+" "+"Skill Name :"+skill.getSkill_name();
    }
    public void getCandidateSkills(String candid_id)
    {
        System.out.println("Candidate Id : "+candid_id);
        for (String value : map.get(candid_id))
        {
            System.out.println(value);
        }
        System.out.println("---------------------------------------");

    }
    public static void main(String []args) throws IOException {

    }
}
