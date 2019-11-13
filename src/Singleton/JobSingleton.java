package Singleton;

import service.Job;

public class JobSingleton {
    public static Job job=null;
    public static Job objectJob()
    {
        if(job==null)
        {
            job=new Job();
        }

        return job;
    }
}
