# java-012-spring-spring-boot

## [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/index.html)

---

## [`spring-boot-starter-actuator`](https://www.baeldung.com/spring-boot-actuators)

Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.
Once this dependency is on the classpath, several endpoints are available for us out of the box. As with most Spring modules, we can easily configure or extend it in many ways.

- `/auditevents` lists security audit-related events such as user login/logout. Also, we can filter by principal or type among other fields.
- `/beans` returns all available beans in our BeanFactory. Unlike `/auditevents`, it doesn't support filtering.
- `/conditions`, formerly known as `/autoconfig`, builds a report of conditions around autoconfiguration.
- `/configprops` allows us to fetch all `@ConfigurationProperties` beans.
- `/env` returns the current environment properties. Additionally, we can retrieve single properties.
- `/flyway` provides details about our Flyway database migrations.
- `/health` summarizes the health status of our application.
- `/heapdump` builds and returns a heap dump from the JVM used by our application.
- `/info` returns general information. It might be custom data, build information or details about the latest commit.
- `/liquibase` behaves like `/flyway` but for Liquibase.
- `/logfile` returns ordinary application logs.
- `/loggers` enables us to query and modify the logging level of our application.
- `/metrics` details metrics of our application. This might include generic metrics as well as custom ones.
- `/prometheus` returns metrics like the previous one, but formatted to work with a Prometheus server.
- `/scheduledtasks` provides details about every scheduled task within our application.
- `/sessions` lists HTTP sessions given we are using Spring Session.
- `/shutdown` performs a graceful shutdown of the application.
- `/threaddump` dumps the thread information of the underlying JVM.

---

## [`spring-boot-starter-json`](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.json)

Jackson is the preferred and default library.

---


## [cheat sheet](https://drive.google.com/file/d/14qPvGjpKtWCN3ec0QNcNjNHF5wCI7GxB/view?usp=sharing)

---

## @SpringBootApplication

A single `@SpringBootApplication` annotation can be used to enable those three features, that is:
- `@EnableAutoConfiguration`: enable Spring Boot’s auto-configuration mechanism
- `@ComponentScan`: enable `@Component` scan on the package where the application is located
- `@SpringBootConfiguration`: enable registration of extra beans in the context or the import of additional configuration classes

---

## @Autowired

If a bean has more than one constructor, you will need to mark the one you want Spring to use with `@Autowired`

```java
@Service
public class MyAccountService implements AccountService {
  //Spring Beans and Dependency Injection
    private final RiskAssessor riskAssessor;
    private final PrintStream out;
    @Autowired
    public MyAccountService(RiskAssessor riskAssessor) {/*...*/}
    public MyAccountService(RiskAssessor riskAssessor, PrintStream out) {/*...*/}
}
```

---

### [Running Your Application](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.running-your-application)

---

## Developer Tools

```text
dependencies {
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}
```
- `spring-boot-devtools` disables the caching options by default

### [Property Defaults for `application.properties`](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools.property-defaults)

- If you wish to log all request details turn on in `application.properties`
```text
spring.mvc.log-request-details
spring.codec.log-request-details
```

### Disabling Restart
```java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false"); // <<<---==========
        SpringApplication.run(MyApplication.class, args);
    }
}
```

---