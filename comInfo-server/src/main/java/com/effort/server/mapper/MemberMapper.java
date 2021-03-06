package com.effort.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.effort.server.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 86137
 * @since 2021-02-21
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}
