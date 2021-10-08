package shy.teamcook.appffix.user.entity;

public class PrivateUserEntity extends UserEntity {

    private String personalNumber; // (주민번호 / 912333-*******)
    private String favoriteDirector; // (선호하는 감독 / 봉준호)
    private String favoriteGenre; // (선호하는 장르 / 액션)

    PrivateUserEntity() {}

    PrivateUserEntity(String personalNumber) {
        this.personalNumber = personalNumber;
        this.favoriteDirector = "";
        this.favoriteGenre = "";
    }

    public PrivateUserEntity(String personalNumber, String favoriteDirector, String favoriteGenre) {
        this.personalNumber = personalNumber;
        this.favoriteDirector = favoriteDirector;
        this.favoriteGenre = favoriteGenre;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getFavoriteDirector() {
        return favoriteDirector;
    }

    public void setFavoriteDirector(String favoriteDirector) {
        this.favoriteDirector = favoriteDirector;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }
}
