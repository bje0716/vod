package shy.teamcook.appffix.user.entity;

public class StudentUserEntity extends PrivateUserEntity {

    private String school; // (학교명 / 동아대학교)
    private int year; // (학년 / 4)

    StudentUserEntity(String school, int year) {
        this.school = school;
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
