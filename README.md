# QualGent-Backend-Coding-Challenge

## Components

- 'qgjob' CLI: Submit and check test jobs
- 'job-server': Backend service managing jobs

## Architecture

![Architecture](https://via.placeholder.com/600x400?text=Architecture+Diagram)

- Jobs grouped by 'app_version_id'
- Status tracked in memory (simplified)
- Redis/Postgres available via Docker

##How to run

```bash
# Start backend
cd job-server
mvn spring-boot:run

# Run CLI
cd qgjob-cli
mvn package
java -jar target/qgjob-cli-1.0.jar submit --org-id=qualgent --app-version-id=xyz123 --test=tests/onboarding.spec.js
```

## GitHub Actions

CI runs `qgjob` to submit and monitor jobs.

## End-to-End Example

1. Start `job-server`
2. Run `qgjob submit`
3. Run `qgjob status --job-id=...`
