package shy.teamcook.appffix.vod.entity;

// 티비 클래스
public class VodTvEntity extends VodEntity {

    private String pd; // (메인PD / 나영석)
    private int series; // (시리즈(몇부작) / 12)

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
