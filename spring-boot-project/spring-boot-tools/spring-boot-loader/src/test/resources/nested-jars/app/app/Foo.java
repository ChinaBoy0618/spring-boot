package app;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Foo implements CommandLineRunner {
	@Override
	public void run(String... args) {
            System.err.println("Foo running...");
        }
}

