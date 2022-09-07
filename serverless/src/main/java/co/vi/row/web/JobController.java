package co.vi.row.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.vi.row.data.Job;
import co.vi.row.ser.JobService;
import io.swagger.annotations.ApiResponses;
@RestController
@RequestMapping("/jobs")
//Line 19 to 24 is the newly added code for swagger documentation
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
}
)
public class JobController {
	@Autowired
    JobService jobService;
	
	@GetMapping("/all")
    public ResponseEntity<List<Job>> getAllJobs () {
        List<Job> allJobs = jobService.getAllJobs();
        return new ResponseEntity<>(allJobs, HttpStatus.OK);
    }
}
