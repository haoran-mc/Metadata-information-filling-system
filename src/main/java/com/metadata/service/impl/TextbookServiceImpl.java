package com.metadata.service.impl;

import com.metadata.entity.Textbook;
import com.metadata.mapper.TextbookMapper;
import com.metadata.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("textbookService")
public class TextbookServiceImpl implements TextbookService {
    @Autowired
    TextbookMapper textbookMapper;

    /**
     * 获取指定名称书籍impl
     * @param year 年份
     * @param batch 批次
     * @param name 名称
     * @return textbook对象集
     */
    @Override
    public List<Textbook> selectTextbook(int year, int batch, String name) {
        List<Textbook> tbList = textbookMapper.selectTextbook(year, batch, name);
        return tbList;
    }

    /**
     * 删除指定id书籍impl
     * @param textbook textbook对象
     * @return null
     */
    @Override
    public void deleteTextbook(Textbook textbook) {
        textbookMapper.deleteTextbook(textbook);
    }

    /**
     * 更新指定id书籍impl
     * @param textbook textbook对象
     * @return null
     */
    @Override
    public void updateTextbook(Textbook textbook) {
        textbookMapper.updateTextbook(textbook);
    }
}
