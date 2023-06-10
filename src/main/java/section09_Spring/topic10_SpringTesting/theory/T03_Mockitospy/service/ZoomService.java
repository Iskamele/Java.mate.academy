package section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.service;

import java.util.List;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.Video;

public interface ZoomService {
    public List<Video> findAllVideos(String keyword);
}
