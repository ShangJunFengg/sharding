package com.test.sharding.service;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.sharding.entity.UserEntity;
import com.test.sharding.mapper.UserMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper,UserEntity>
{

    public List<UserEntity> getUser() {
       return baseMapper.selectList(Wrappers.<UserEntity>lambdaQuery());
    }

    public boolean insertUser(UserEntity user) {
            return super.save(user);
    }
}
