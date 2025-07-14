package com.qualgent.jobserver.controller;
import com.qualgent.jobserver.model.Job;
inport com.qualgent.jobserver.service.JobService:
import org.springframework.web, bind annotation.*=
import java.util.UUID;
Les I
@RestController
@RequestMapping ("/jobs")
Mes y publio class Jobcontroller (
private final Jooservice jobservice:
public JobController(Jobservice JobService i
this jobservice - jobservice:
@PostMapping
public Dob subnitJob(@RequestBody Joh job) {
job.setId(UUID. randomUUID().tostringO);
neturn jobService.submitlob(job);
public ob getJob(@PathVariable String id) t
