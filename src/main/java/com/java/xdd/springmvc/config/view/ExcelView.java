package com.java.xdd.springmvc.config.view;

import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 表格视图
 */
public class ExcelView extends AbstractXlsxView {

    /**
     * 构建excel视图
     * @param model
     * @param workbook
     * @param request
     * @param response
     * @throws Exception
     */
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Sheet sheet = workbook.createSheet("sheet1");
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        style.setAlignment(CellStyle.ALIGN_CENTER);
        Row row = null;
        Cell cell = null;
        int rowCount = 0;
        int colCount = 0;

        // 创建头部
        row = sheet.createRow(rowCount++);

        cell = row.createCell(colCount++);
        cell.setCellStyle(style);
        cell.setCellValue("ID");

        cell = row.createCell(colCount++);
        cell.setCellStyle(style);
        cell.setCellValue("NAME");


        // 创建数据
        row = sheet.createRow(rowCount++);
        colCount = 0;

        row.createCell(colCount++).setCellValue(123);
        row.createCell(colCount++).setCellValue("abc");

        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i, true);
        }

        //设置excel下载名称
        response.addHeader("Content-Disposition", "attachment;filename=abc.xlsx");
    }
}
