package shy.teamcook.appffix.user.entity;

public class UserEntity {

    private String id; // (아이디 / hong1234)
    private String pw; // (비밀번호(암호화) / 5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8)
    private String name; // (이름 / 홍길동)
    private String tel; // (연락처 / 010-1234-1234)
    private String address; // (주소 / 부산 사상구 사상로 56)
    private String grade; // (등급 / Basic, Standard, Premium)
    private long joinedDate;

    UserEntity() {}

    public UserEntity(String id, String name, String tel, String address, String grade) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.grade = grade;
    }

    public String toString() {
        return "id : " + getId() + ", name : " + getName() + ", tel : " + getTel() +
                ", address : " + getAddress() + ", grade : " + getGrade();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
