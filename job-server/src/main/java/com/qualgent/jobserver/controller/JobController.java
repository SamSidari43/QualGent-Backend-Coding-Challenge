package com.qualgent.jobserver.controller;

import com.qualgent.jobserver.model.Job;
import com.qualgent.jobserver.service.JobService:
import org.springframework.web, bind annotation.*;

import java.util.UUID;

@RestController
@RequestMapping ("/jobs")
public class Jobcontroller (
  
  private final Jobservice jobservice;

  public JobController(Jobservice jobService {
    this.jobservice = jobservice;
  }

  @PostMapping
  public Job submitJob(@RequestBody Job job) {
    job.setId(UUID. randomUUID().tostring());
    return jobService.submitlob(job);
  }

  @GetMapping("/{id}")
  public Job getJob(@PathVariable String id) {
    return jobService.getJob(id);
  }
