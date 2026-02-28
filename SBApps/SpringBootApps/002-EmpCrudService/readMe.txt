
Observe the entries in application.properties file
Rest URLS :

GET  : http://localhost:9001/employees/103
GET  : http://localhost:9001/employees
GET  : http://localhost:9001/getemployeebyfirstname/ameya
POST : http://localhost:9001/employees --->This will have Json in body
PUT  : http://localhost:9001/employees/103--->this will have Json in body
DELETE : http://localhost:9001/employees/103

NOTE : Show the console for SQL queries
NOTE : Change the name of getByFirstNameIgnoreCase() to getByFirstName() in controller/service/serviceImpl/dao

rerun the code
and invoke GET  : http://localhost:8080/getemployeebyfirstname/ameya

Observe the SQL on console :)

Swagger :
Add the dependencies in pom.xml update maven project
Code in the com.ameya.employee.SwaggerConfig class

URLS : 
http://localhost:9001/v2/api-docs
http://localhost:9001/swagger-ui.html


#Post request
#http://localhost:9001/emp/actuator/shutdown

#Get request
#http://localhost:9001/emp/actuator/health
#http://localhost:9001/emp/actuator/info
#http://localhost:9001/emp/actuator/beans
#http://localhost:9001/emp/actuator/env

-------------------------------- Custom endpoint -----------------------------------------
@Component
public class CustomEndpoint implements Endpoint<List<String>> {
     
    @Override
    public String getId() {
        return "customEndpoint";
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
 
    @Override
    public boolean isSensitive() {
        return true;
    }
 
    @Override
    public List<String> invoke() {
        // Custom logic to build the output
        List<String> messages = new ArrayList<String>();
        messages.add("This is message 1");
        messages.add("This is message 2");
        return messages;
    }
}
