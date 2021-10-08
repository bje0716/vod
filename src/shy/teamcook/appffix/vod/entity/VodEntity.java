package shy.teamcook.appffix.vod.entity;

import java.util.UUID;

// VOD 메인 클래스
public class VodEntity {

    private String vodName; // (VOD명 / 명량)
    private String production; // (제작사 / 빅스톤픽쳐스)
    private String genre; // (장르 / 액션)
    private UUID isbn; // (isbn / 674a1c79-1e01-45b2-87ca-54fe5644e7f6)
    private int price; // (가격(원) / 4500)
    private int launchYear; // (개봉년도 / 2014)
    private float rating; // (평점 / 5.0)

    VodEntity() {}

    public VodEntity(String vodName, String production, String genre, UUID isbn, int price, int launchYear, float rating) {
        this.vodName = vodName;
        this.production = production;
        this.genre = genre;
        this.isbn = isbn;
        this.price = price;
        this.launchYear = launchYear;
        this.rating = rating;
    }

    public String getVodName() {
        return vodName;
    }

    public void setVodName(String vodName) {
        this.vodName = vodName;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public UUID getIsbn() {
        return isbn;
    }

    public void setIsbn(UUID isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
