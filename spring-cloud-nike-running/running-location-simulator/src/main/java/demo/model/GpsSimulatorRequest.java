package demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class GpsSimulatorRequest {

    private String runningId;
    private Double speed;
    private boolean move = true;
    private boolean exportPositionsToMessaging = true;
    private Integer reportInterval = 500;
    private int secondsToError = 0;
    private RunnerStatus runnerStatus;
    private String polyline;
    //@Nike Running
    private MedicalInfo medicalInfo;

    @Override
    public String toString() {
        return "GpsSimulatorRequest [runningId=" + runningId + ", speed=" + speed + ", move=" + move + ", exportPositionsToMessaging=" + exportPositionsToMessaging
                + ", reportInterval=" + reportInterval + "]";
    }

}
