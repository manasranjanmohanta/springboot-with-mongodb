# springboot-with-mongodb

## Mongock : Why we need Database Migration?

- Application are usually deployed to multiple environments.
- Database changes cannot be managed manually, like:
    - Add new field
    - Update existing field
    - Update records inside collection
- Need to automate this using tool like `Mongock`.
- Similar tool in Relations Databases are - Flyway and Liquibase
