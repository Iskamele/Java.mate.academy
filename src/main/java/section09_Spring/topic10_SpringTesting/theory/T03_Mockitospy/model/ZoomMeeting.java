package section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ZoomMeeting {
    private String uuid;
    private Long id;
    private String topic;
    @JsonProperty(value = "account_id")
    private String accountId;
    @JsonProperty(value = "chare_url")
    private String shareUrl;
    @JsonProperty(value = "start_time")
    private String startTime;
    @JsonProperty(value = "recording_files")
    private List<ZoomRecordingFile> zoomRecordingFiles;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<ZoomRecordingFile> getZoomRecordingFiles() {
        return zoomRecordingFiles;
    }

    public void setZoomRecordingFiles(List<ZoomRecordingFile> zoomRecordingFiles) {
        this.zoomRecordingFiles = zoomRecordingFiles;
    }
}
