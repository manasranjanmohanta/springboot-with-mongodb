# springboot-with-mongodb

## Mongock : Why we need Database Migration?

- Application are usually deployed to multiple environments.
- Database changes cannot be managed manually, like:
    - Add new field
    - Update existing field
    - Update records inside collection
- Need to automate this using tool like `Mongock`.
- Similar tool in Relations Databases are - Flyway and Liquibase

## Implement Mongock in your Springboot Project

1. Add Mongock bom to your Pom file
   
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.github.cloudyrock.mongock</groupId>
            <artifactId>mongock-bom</artifactId>
            <version>4.3.8</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
2. Add the maven dependency for the runner
`Runner options`

```xml
<dependency>
    <groupId>com.github.cloudyrock.mongock</groupId>
    <artifactId>mongock-spring-v5</artifactId>
</dependency>
```
3. Add the maven dependency for the driver
`Driver options`

```xml
<dependency>
    <groupId>com.github.cloudyrock.mongock</groupId>
    <artifactId>mongodb-springdata-v3-driver</artifactId>
</dependency>
```
