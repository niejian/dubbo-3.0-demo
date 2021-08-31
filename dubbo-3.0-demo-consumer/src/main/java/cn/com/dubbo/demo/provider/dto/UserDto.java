package cn.com.dubbo.demo.provider.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author niejian9001@163.com
 * @className cn.com.dubbo.demo.provider.dto
 * @description:
 * @create 2021-08-30 09:15
 */
public class UserDto implements Serializable {
    private Integer age;
    private boolean sex;
    private String address;
    private String name;
    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return sex == userDto.sex &&
                Objects.equals(age, userDto.age) &&
                Objects.equals(address, userDto.address) &&
                Objects.equals(name, userDto.name) &&
                Objects.equals(id, userDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sex, address, name, id);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public UserDto(Integer age, boolean sex, String address, String name, Integer id) {
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
