package com.dytian.yuemee.user.serviceIpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dytian.yuemee.common.entity.User_relation;
import com.dytian.yuemee.user.mapper.User_relationMapper;
import com.dytian.yuemee.user.service.IUser_relationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户关系表 服务实现类
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
@Service
public class User_relationServiceImpl extends ServiceImpl<User_relationMapper, User_relation> implements IUser_relationService {

}
