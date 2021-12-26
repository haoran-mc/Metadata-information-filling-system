package com.metadata.service;

import com.metadata.entity.Textbook;

import java.util.List;

public interface TextbookService {
    /**
     * 获取指定名称书籍service
     * @param year 年份
     * @param batch_idx 批次
     * @param name 名称
     * @return textbook对象集
     */
    List<Textbook> selectTextbook(int year, int batch, String name);

    /**
     * 删除指定id书籍service
     * @param id 教材 id
     * @return null
     */
    void deleteTextbook(int id);

    /**
     * 更新指定id书籍service
     * @param textbook textbook对象
     * @return null
     */
    void updateTextbook(Textbook textbook);
}
