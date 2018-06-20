package com.task.station;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = StationApplication.class)
@TestPropertySource(locations ="classpath:application.properties")
public class StationApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void applicationStartsTest() {
        StationApplication.main(new String[] {});
	}

}
