import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan({"producer"})
public class KafkaTest1Producer1 {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTest1Producer1.class, args);
	}
}
