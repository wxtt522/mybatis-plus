package com.example.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.TDict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author sin
 * @since 2020-03-25
 */
public interface TDictMapper extends BaseMapper<TDict> {

    IPage<TDict> listDictDetail(Page page);
}
