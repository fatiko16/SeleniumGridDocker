package dockertest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Setup_DockerGrid {

    @BeforeTest
    void startDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("bash start_dockergrid.sh");
        Thread.sleep(15000);
    }


    @AfterTest
    void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("bash stop_dockergrid.sh");
        Thread.sleep(5000);

    }
}
