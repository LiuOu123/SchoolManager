package com.kgc.controller;


import com.kgc.pojo.Works;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

import javax.servlet.ServletOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcleImpl {
    public void export(String[] titles, ServletOutputStream out, List<Works> list) throws Exception {
        try {
            // 第一步，创建一个workbook，对应一个Excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();

            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");

            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short

            HSSFRow row = hssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
            HSSFCellStyle hssfCellStyle1 = workbook.createCellStyle();
            //居中样式
            hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            hssfCellStyle1.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            hssfCellStyle1.setBorderLeft((short) 1);
            hssfCellStyle1.setBorderBottom((short) 1);
            hssfCellStyle1.setBorderRight((short) 1);
            hssfCellStyle1.setBorderTop((short) 1);
            HSSFCell hssfCell = null;
            for (int i = 0; i < titles.length; i++) {
                hssfCell = row.createCell(i);//列索引从0开始
                hssfCell.setCellValue(titles[i]);//列名1
                hssfCell.setCellStyle(hssfCellStyle);//列居中显示
                hssfCellStyle.setBorderLeft((short) 1);
                hssfCellStyle.setBorderBottom((short) 1);
                hssfCellStyle.setBorderRight((short) 1);
                hssfCellStyle.setBorderTop((short) 1);
                hssfCellStyle.setFillBackgroundColor((short)255);
            }

            // 第五步，写入实体数据
            /*Works Works1=new Works(1,1,1,1,"0902作业","哈哈哈",new Date(),1,"1.jpg");*/
            /*Works  Works2=new Works("2","李四","123","18");
            Works  Works3=new Works("3","王五","123","77");
            Works Works4=new Works("4","徐小筱","123","1");*/

            //这里我把list当做数据库啦
            /*ArrayList<Works> list=new ArrayList<Works>();*/
            /*list.add(Works1);*/
/*            list.add(Works2);
            list.add(Works3);
            list.add(Works4);*/

            HSSFCell hssfCell1=null;
            for (int i = 0; i < list.size(); i++) {
                row = hssfSheet.createRow(i + 1);
                Works Works = list.get(i);
                // 第六步，创建单元格，并设置值
                String id = null;
                if (Works.getGrade().getGname() != null) {
                    id = Works.getGrade().getGname();
                }
                hssfCell1=row.createCell(0);
                hssfCell1.setCellValue(id);
                hssfCell1.setCellStyle(hssfCellStyle1);
                String name = "";
                if (Works.getUserInfo().getNickname() != null) {
                    name = Works.getUserInfo().getNickname();
                }
                hssfCell1=row.createCell(1);
                hssfCell1.setCellValue(name);
                hssfCell1.setCellStyle(hssfCellStyle1);
                String password = "";
                if (Works.getWortitle() != null) {
                    password = Works.getWortitle();
                }
                hssfCell1=row.createCell(2);
                hssfCell1.setCellValue(password);
                hssfCell1.setCellStyle(hssfCellStyle1);
                String age = null;
                if (Works.getWornei() != null) {
                    age = Works.getWornei();
                }
                hssfCell1=row.createCell(3);
                hssfCell1.setCellValue(age);
                hssfCell1.setCellStyle(hssfCellStyle1);

                Date date = null;
                java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
                String time = formatter.format(new Date());//格式化数据bai
                if (Works.getWordate() != null) {
                    date = Works.getWordate();
                    time = formatter.format(date);//格式化数据bai
                }
                hssfCell1=row.createCell(4);
                hssfCell1.setCellValue(time);
                hssfCell1.setCellStyle(hssfCellStyle1);

            }

            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("导出信息失败！");

        }
    }
}
