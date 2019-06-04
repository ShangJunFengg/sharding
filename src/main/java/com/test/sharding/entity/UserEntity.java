package com.test.sharding.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper =true)
@Accessors(chain = true)
@TableName("user")
public class UserEntity extends Model <UserEntity> {

    private int id;
    private String name;
    private int age;

}
