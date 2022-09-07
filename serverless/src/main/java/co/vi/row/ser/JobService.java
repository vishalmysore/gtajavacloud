package co.vi.row.ser;
import java.util.List;

import org.springframework.stereotype.Component;

import co.vi.row.data.Job;
@Component
public interface JobService {

	List<Job> getAllJobs();
}
