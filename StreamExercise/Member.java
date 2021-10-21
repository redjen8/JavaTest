class Member {
    private String name;
    private int age;
    private String socialId;
    private String phoneNumber;

    public Member(String name, int age, String socialId, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.socialId = socialId;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSocialId() {
        return this.socialId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}