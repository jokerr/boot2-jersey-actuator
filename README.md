# boot-2-jersey-actuator

This is a simple "Hello World" project that uses Spring Boot 2 Jersey and Actuator projects.  The project is based off
of the spring-boot-sample-jersey project 
(https://github.com/spring-projects/spring-boot/tree/v2.0.0.RELEASE/spring-boot-samples/spring-boot-sample-jersey).

This program was tested using JDK 1.8.

Startup Output:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.0.RELEASE)

2018-03-09 21:56:15.179  INFO 12148 --- [           main] com.example.BootApp                      : Starting BootApp on REDACTED with PID 12148 (C:\Users\jokerr\dev\boot2-jersey-actuator\target\classes started by jokerr in C:\Users\jokerr\dev\boot2-jersey-actuator)
2018-03-09 21:56:15.182  INFO 12148 --- [           main] com.example.BootApp                      : No active profile set, falling back to default profiles: default
2018-03-09 21:56:15.247  INFO 12148 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@4c22c4ba: startup date [Fri Mar 09 21:56:15 CST 2018]; root of context hierarchy
2018-03-09 21:56:16.386  INFO 12148 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2018-03-09 21:56:16.792  INFO 12148 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-03-09 21:56:16.823  INFO 12148 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-03-09 21:56:16.823  INFO 12148 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.28
2018-03-09 21:56:16.836  INFO 12148 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_162\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\ProgramData\Oracle\Java\javapath;C:\Program Files\Docker\Docker\Resources\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\Intel\OpenCL SDK\2.0\bin\x86;C:\Program Files (x86)\Intel\OpenCL SDK\2.0\bin\x64;C:\Program Files\Git\cmd;C:\Users\jokerr\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Microsoft VS Code\bin;C:\Program Files\Java\jdk1.8.0_162\bin;;.]
2018-03-09 21:56:16.958  INFO 12148 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-03-09 21:56:16.959  INFO 12148 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1717 ms
2018-03-09 21:56:18.124  INFO 12148 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-03-09 21:56:18.124  INFO 12148 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-03-09 21:56:18.124  INFO 12148 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpTraceFilter' to: [/*]
2018-03-09 21:56:18.124  INFO 12148 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet com.example.jaxrs.JerseyConfig mapped to [/v1/*]
2018-03-09 21:56:18.526  INFO 12148 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-03-09 21:56:18.586  INFO 12148 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-03-09 21:56:18.591  INFO 12148 --- [           main] com.example.BootApp                      : Started BootApp in 3.806 seconds (JVM running for 9.195)
```