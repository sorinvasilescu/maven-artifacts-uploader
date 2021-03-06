package apollo.upload;

import apollo.maven.MavenDeployer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;

public class MavenUploadThread implements Runnable {

    private final MavenDeployer mavenDeployer;
    private final Path path;
    private static final Logger logger = LogManager.getLogger(MavenUploadThread.class);

    public MavenUploadThread(MavenDeployer mavenDeployer, Path path) {
        this.mavenDeployer = mavenDeployer;
        this.path = path;
    }

    @Override
    public void run() {
        mavenDeployer.deployArtifact(path);
    }
}
