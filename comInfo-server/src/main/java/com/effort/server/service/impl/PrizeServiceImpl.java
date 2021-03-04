package com.effort.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.effort.server.mapper.PrizeMapper;
import com.effort.server.pojo.Prize;
import com.effort.server.service.IPrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
@Service
public class PrizeServiceImpl extends ServiceImpl<PrizeMapper, Prize> implements IPrizeService {
    @Autowired
    private PrizeMapper prizeMapper;

    @Override
    public void addPrize(Prize prize) {
        prizeMapper.insert(prize);
    }
}
