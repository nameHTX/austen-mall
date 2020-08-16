package com.austen.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.austen.common.utils.PageUtils;
import com.austen.mail.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author Austen.Huang
 * @email 923502259@qq.com
 * @date 2020-08-16 21:56:15
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

