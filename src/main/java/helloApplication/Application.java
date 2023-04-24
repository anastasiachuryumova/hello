package helloApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"helloApplication.controller"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
///mvn - f ("Users/anastasiacurumova/Desktop/hello/pom.xml") compile Users/anastasiacurumova/Desktop/hello/pom.xml
///mvn - f ("/hello/pom.xml") compile
//mvn -f <Users/anastasiacurumova/Desktop/hello/pom.xml> compile
//os.chdir(r'Users/anastasiacurumova/Desktop/hello/')
//os.chdir('Users/anastasiacurumova/Desktop/hello/')
//mvn -f hello/pom.xml compile
//a13e41adc02340e08c0d8db0b2ad4463 password jenkins