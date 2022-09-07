package co.vi.row.ser;

import org.springframework.stereotype.Service;

import co.vi.row.data.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class JobServiceImpl implements JobService{
	
	/**
	 * This service should call a Lambda function for aws and gcp serverless and find matching jobs from differnt sources
	 */
	@Override
	public List<Job> getAllJobs() {
	    List<Job> jobs = new ArrayList();
	    jobs.add(new Job("Java Job "+System.currentTimeMillis()));
		return jobs;
	}

	
}
