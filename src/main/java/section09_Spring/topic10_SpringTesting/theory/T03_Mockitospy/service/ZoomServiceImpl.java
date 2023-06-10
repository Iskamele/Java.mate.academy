package section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.Video;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.ZoomMeeting;
import section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model.ZoomRecordingFile;

public class ZoomServiceImpl implements ZoomService {
    public List<Video> findAllVideos(String keyword) {
        List<ZoomMeeting> recordings = getMeetings(keyword);
        return recordings.stream()
                .map(this::convertRecordingToVideo)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    List<ZoomMeeting> getMeetings(String keyword) {
        // TODO: need to add some logic how to send HTTP request to ZOOM API
        // for now just return empty list
        return Collections.emptyList();
    }

    List<Video> convertRecordingToVideo(ZoomMeeting meeting) {
        List<Video> videosToUpload = new ArrayList<>();
        for (ZoomRecordingFile recordingFile : meeting.getZoomRecordingFiles()) {
            Video video = new Video();
            video.setTitle(meeting.getTopic());
            video.setContent(download(recordingFile.getDownloadUrl()));
            videosToUpload.add(video);
        }
        return videosToUpload;
    }

    InputStream download(String downloadUrl) {
        return new ByteArrayInputStream("demo".getBytes());
    }
}
