package shy.teamcook.appffix.vod.entity;

// 영화 클래스
public class VodMovieEntity extends VodEntity {

    private String director; // (영화감독 / 김한민)
    private int period; // (상영시간(분) / 128)

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
