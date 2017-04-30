package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbSturesultMapper;
import com.lsc.exam.dao.model.TbSturesult;
import com.lsc.exam.dao.model.TbSturesultExample;
import com.lsc.exam.service.api.TbSturesultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbSturesultService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbSturesultServiceImpl extends BaseServiceImpl<TbSturesultMapper, TbSturesult, TbSturesultExample> implements TbSturesultService {

    private static Logger _log = LoggerFactory.getLogger(TbSturesultServiceImpl.class);

    @Autowired
    TbSturesultMapper tbSturesultMapper;

}