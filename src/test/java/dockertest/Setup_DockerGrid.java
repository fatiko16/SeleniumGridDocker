package dockertest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Setup_DockerGrid {

    @BeforeTest
    void startDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
        Thread.sleep(15000);
    }


    @AfterTest
    void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
        Thread.sleep(5000);

    }
}
