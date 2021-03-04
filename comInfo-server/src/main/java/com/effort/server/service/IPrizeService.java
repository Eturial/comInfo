package com.effort.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.effort.server.pojo.Prize;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 86137
 * @since 2021-03-02
 */
public interface IPrizeService extends IService<Prize> {

    void addPrize(Prize prize);
}
