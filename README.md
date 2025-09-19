Java with spring boot

Initilaised springboot with dependecncies : 
	Spring Web → REST endpoints
	Spring Data JPA → ORM for PostgreSQL
	PostgreSQL Driver → Connect to Postgres
	Spring Security → JWT auth for admin APIs
	Spring Boot DevTools → optional, hot reload for dev
	Lombok → optional, reduces boilerplate for entities/controllers

	Spring Data Redis → for threshold rules & counters
	Validation → @Valid annotations for request payloads
	Spring Boot Actuator → health endpoints, metrics

Configured application.yml including:
	database
	jpa
	redis config
	jwt security


Using docker:
	installed docker
	setup postgres for docker
		docker run --name security-postgres \ -e POSTGRES_PASSWORD=postgres \ -e POSTGRES_DB=security_alerts \ -p 5432:5432 \ -d postgres:15

	setup redis
		docker run --name security-redis -p 6379:6379 -d redis:7
	test: docker exec -it security-redis redis-cli ping

	Add docker compose to project root to persist data, stop and run container

