package shy.teamcook.appffix.user.entity;

public class WorkerUserEntity extends PrivateUserEntity {

    private String workerPlace; // (소속된 회사 / 부산시청)
    private String job; // (직급 / 대리)

    WorkerUserEntity(String workerPlace, String job) {
        this.workerPlace = workerPlace;
        this.job = job;
    }

    public String getWorkerPlace() {
        return workerPlace;
    }

    public void setWorkerPlace(String workerPlace) {
        this.workerPlace = workerPlace;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
