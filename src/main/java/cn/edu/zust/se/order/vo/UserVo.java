package cn.edu.zust.se.order.vo;
/**
 * 用户数据对象
 * @author czg
 * @since 2022/5/30 11:38
 */
public class UserVo {
    int id;
    String loginName;
    String password;
    String name;
    String mobile;
    String email;
    int type;

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                '}';
    }

    public UserVo(){

}
public UserVo(int id,String loginName,String name,String password,String mobile,String email,int type){
    this.id=id;
    this.loginName=loginName;
    this.name=name;
    this.password=password;
    this.mobile=mobile;
    this.email=email;
    this.type=type;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
