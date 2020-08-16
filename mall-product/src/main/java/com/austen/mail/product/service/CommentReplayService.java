package com.austen.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.austen.common.utils.PageUtils;
import com.austen.mail.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Austen.Huang
 * @email 923502259@qq.com
 * @date 2020-08-16 21:56:16
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

