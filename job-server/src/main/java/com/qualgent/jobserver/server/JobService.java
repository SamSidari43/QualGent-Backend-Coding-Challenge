package con.qualgent.jobserver.service;
import com-qualgent.jobserver.model.Job;
import org. springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.ConcurrentHashhap;
@Service
• public class JobService {
private Final Map<String, Job> jobStore = new ConcurrentHashMap<>();
public Job submitJob(Job job) {
jobStore.put (job.getId(), job);
In a real app: enqueue job, group by app_version_id, assign to agent
return job;
public Job getJob(String id) t
return jobstore get(id);
