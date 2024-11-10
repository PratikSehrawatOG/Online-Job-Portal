Main.java 

**CODE**👇👇

import dao.JobDAO;
import model.Job;

public class Main {
    public static void main(String[] args) {
        JobDAO jobDAO = new JobDAO();

        // Add a new job
        Job job = new Job("Software Developer", "Develop and maintain software", 1);
        jobDAO.addJob(job);

        // Retrieve a job by ID
        Job retrievedJob = jobDAO.getJob(1);
        if (retrievedJob != null) {
            System.out.println("Job Title: " + retrievedJob.getTitle());
        }

        // Update job details
        retrievedJob.setTitle("Senior Software Developer");
        jobDAO.updateJob(retrievedJob);

        // Get all jobs
        for (Job j : jobDAO.getAllJobs()) {
            System.out.println("Job ID: " + j.getJobId() + ", Title: " + j.getTitle());
        }

        // Delete a job
        jobDAO.deleteJob(1);
    }
}
