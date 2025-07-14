# QualGent-Backend-Coding-Challenge

##Components

- 'qgjob' CLI: Submit and check test jobs
- 'job-server': Backend service managing jobs

##Architecture

![Architecture](https://via.placeholder.com/600x400?text=Architecture+Diagram)

- Jobs grouped by 'app_version_id'
- Status tracked in memory (simplified)
- Redis/Postgres available via Docker
