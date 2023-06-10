package section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZoomRecordingFile {
    private String id;
    @JsonProperty(value = "meeting_id")
    private Long meetingId;
    @JsonProperty(value = "file_size")
    private Long fileSize;
    @JsonProperty(value = "play_url")
    private String playUrl;
    @JsonProperty(value = "download_url")
    private String downloadUrl;
    private Status status;

    public enum Status {
        @JsonProperty("processing")
        PROCESSING,
        @JsonProperty("completed")
        COMPLETED
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Long meetingId) {
        this.meetingId = meetingId;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
