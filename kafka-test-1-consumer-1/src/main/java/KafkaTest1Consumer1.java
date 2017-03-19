import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"consumer"})
public class KafkaTest1Consumer1 {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTest1Consumer1.class, args);
	}
}
