package com.qualgent. jobserver .model;
public class Job {
private String id; private String orgId;
private String appVersionId;
private String testPath;
private String target;
private String status = "QUEUED";
I
// getters and setters
public String getId() ( return id; } public void setId(String id) ( this.id - id; }
140
117
148
public String getOrgId() { return orgid; }
public void setOrgid(String orgid) { this.orgId = orgId; }
public String getAppVersionId() { return appVersionid; }
public void setAppVersionId(String appVersionId) { this.appVersionId = appVersionId; }
1137
public String getTestPath() { return testPath; }
public void setTestPath(String testPath) { this.testPath = testPath; }
public String getTarget() ( return target; }
public void setTarget(String target) { this. target = target; }
public String getStatus() { return status; }
public void setStatus (String status) { this.status = status; }
