package com.dytian.yuemee.order.serviceIpl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dytian.yuemee.order.entity.JdCart;
import com.dytian.yuemee.order.mapper.JdCartMapper;
import com.dytian.yuemee.order.service.IJdCartService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author dytian
 * @since 2019-03-09
 */
@Service
public class JdCartServiceImpl extends ServiceImpl<JdCartMapper, JdCart> implements IJdCartService {

}
