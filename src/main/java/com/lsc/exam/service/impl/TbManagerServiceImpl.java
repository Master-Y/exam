package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbManagerMapper;
import com.lsc.exam.dao.model.TbManager;
import com.lsc.exam.dao.model.TbManagerExample;
import com.lsc.exam.service.api.TbManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbManagerService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbManagerServiceImpl extends BaseServiceImpl<TbManagerMapper, TbManager, TbManagerExample> implements TbManagerService {

    private static Logger _log = LoggerFactory.getLogger(TbManagerServiceImpl.class);

    @Autowired
    TbManagerMapper tbManagerMapper;

}