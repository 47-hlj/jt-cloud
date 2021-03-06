package com.cy.jt.system.service;
import com.cy.jt.system.domain.SysNotice;

import java.util.List;

/**
 * 业务逻辑处理
 */
public interface SysNoticeService {
     List<SysNotice> selectNotices(SysNotice notice);
     SysNotice selectById(Long id);
     int insertNotice(SysNotice notice);
     int updateNotice(SysNotice notice);
     int deleteById(Long ...id);
}

