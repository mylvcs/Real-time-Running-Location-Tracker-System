package demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class RunnerStatus {
    private Status status = Status.NONE;
    private int distance;
    private String startDate;
    private String startTime;
    private boolean isFinished;
    private boolean isUpload;
}