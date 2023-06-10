package section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.Video;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.ZoomMeeting;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.ZoomRecordingFile;

class ZoomServiceTest {
    private ZoomServiceImpl zoomService = new ZoomServiceImpl();

    @Test
    void findAllVideos_Ok() {
        ZoomRecordingFile recordingFile = new ZoomRecordingFile();
        recordingFile.setDownloadUrl("http://zoom.us/download/2e32e324f45g5tgv8ygfty7tf");
        recordingFile.setStatus(ZoomRecordingFile.Status.COMPLETED);

        ZoomMeeting javaLesson = new ZoomMeeting();
        javaLesson.setTopic("java lesson");
        javaLesson.setZoomRecordingFiles(List.of(recordingFile));

        List<ZoomMeeting> meetings = new ArrayList<>();
        meetings.add(javaLesson);

        zoomService = Mockito.spy(zoomService);
        Mockito.doReturn(meetings).when(zoomService).getMeetings("lesson");

        List<Video> actual = zoomService.findAllVideos("lesson");
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(1, actual.size());
        Assertions.assertEquals("java lesson", actual.get(0).getTitle());
    }
}