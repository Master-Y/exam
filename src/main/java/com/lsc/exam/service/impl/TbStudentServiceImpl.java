package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbStudentMapper;
import com.lsc.exam.dao.model.TbStudent;
import com.lsc.exam.dao.model.TbStudentExample;
import com.lsc.exam.service.api.TbStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbStudentService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbStudentServiceImpl extends BaseServiceImpl<TbStudentMapper, TbStudent, TbStudentExample> implements TbStudentService {

    private static Logger _log = LoggerFactory.getLogger(TbStudentServiceImpl.class);

    @Autowired
    TbStudentMapper tbStudentMapper;

}