# Liquibase database evolution with with Spring Boot 
Liquibase can not generate ChangeLog from empty database or JPA entities. It should be run against existing database(dev or test) initially before using Liquibase-Hibernate plugin. If you do not have existing database, create new one with 1 table and Liquibase takes it from there. Steps to setup Liquibase from Scratch
1. Create SpringBoot project or clone this project
2. Add `liquibase.properties` under src/main/resources folder with the following content and change DB properties accordingly
```outputChangeLogFile= src/main/resources/db/db.changelog-master.xml
driver=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/liquibasedemo
username=root
password=<your password>


# Reference Properties
referenceUrl=hibernate:spring:com.liquibasedemo.model?dialect=org.hibernate.dialect.MySQLDialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy
```
3 Add Liquibase plugin to pom.xml and change change log file locations. Replace versions based on my pom.xml file
```xml
<plugin>
                <groupId>org.liquibase</groupId>
                <artifactId>liquibase-maven-plugin</artifactId>
                <version>${liquibase-maven-plugin.version}</version>
                <configuration>
                    <propertyFile>src/main/resources/liquibase.properties</propertyFile>
                    <changeLogFile>src/main/resources/db/db.changelog-master.xml</changeLogFile>
                    <diffChangeLogFile>src/main/resources/db/changelog/${maven.build.timestamp}_changelog.xml</diffChangeLogFile>
                    <logging>info</logging>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.liquibase.ext</groupId>
                        <artifactId>liquibase-hibernate5</artifactId>
                        <version>${liquibase-hibernate5.version}</version>
                    </dependency>
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-data-jpa</artifactId>
                        <version>${spring-boot.version}</version>
                    </dependency>
                    <dependency>
                        <groupId>javax.validation</groupId>
                        <artifactId>validation-api</artifactId>
                        <version>${validation-api.version}</version>
                    </dependency>
                    <dependency>
                        <groupId>org.javassist</groupId>
                        <artifactId>javassist</artifactId>
                        <version>${javassist.version}</version>
                    </dependency>

                </dependencies>
            </plugin>
```
4 Change `application-dev.yml` to point to custom change log file 
```yaml
  liquibase:
    contexts: dev
    change-log: classpath:db/db.changelog-master.xml
```
5 Now let's create empty database with a a table on it

