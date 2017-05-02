package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbUserMapper;
import com.lsc.exam.dao.model.TbUser;
import com.lsc.exam.dao.model.TbUserExample;
import com.lsc.exam.service.api.TbUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbUserService实现
* Created by shuzheng on 2017/5/2.
*/
@Service
@Transactional
@BaseService
public class TbUserServiceImpl extends BaseServiceImpl<TbUserMapper, TbUser, TbUserExample> implements TbUserService {

    private static Logger _log = LoggerFactory.getLogger(TbUserServiceImpl.class);

    @Autowired
    TbUserMapper tbUserMapper;

}