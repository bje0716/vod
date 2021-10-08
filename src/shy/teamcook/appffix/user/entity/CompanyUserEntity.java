package shy.teamcook.appffix.user.entity;

public class CompanyUserEntity extends UserEntity {

    private String businessLicenseNumber; // (사업자번호 / 123-123-123)
    private String companyType; // (기업유형 / 미디어, 일반)
    private String favoriteMedia; // (선호하는 컨텐츠 / 영화, 티비)

    CompanyUserEntity() {}

    CompanyUserEntity(String businessLicenseNumber, String companyType, String favoriteMedia) {
        this.businessLicenseNumber = businessLicenseNumber;
        this.companyType = companyType;
        this.favoriteMedia = favoriteMedia;
    }

    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getFavoriteMedia() {
        return favoriteMedia;
    }

    public void setFavoriteMedia(String favoriteMedia) {
        this.favoriteMedia = favoriteMedia;
    }
}
