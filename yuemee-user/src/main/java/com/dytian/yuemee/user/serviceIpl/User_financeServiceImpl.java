package com.dytian.yuemee.user.serviceIpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dytian.yuemee.user.entity.User_finance;
import com.dytian.yuemee.user.mapper.User_financeMapper;
import com.dytian.yuemee.user.service.IUser_financeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账户 服务实现类
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
@Service
public class User_financeServiceImpl extends ServiceImpl<User_financeMapper, User_finance> implements IUser_financeService {

}
