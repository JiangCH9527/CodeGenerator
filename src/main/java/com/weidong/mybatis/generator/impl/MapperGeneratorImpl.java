package com.weidong.mybatis.generator.impl;

import com.google.common.collect.Lists;
import com.weidong.mybatis.connect.Connector;
import com.weidong.mybatis.generator.base.BaseGeneratorImpl;
import com.weidong.mybatis.generator.context.GeneratorContext;
import com.weidong.mybatis.utils.GeneratorStringUtils;
import com.weidong.mybatis.utils.MysqlDatabaseMetaTypeUtil;
import com.weidong.mybatis.utils.MysqlKeywordUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：Mapper.xml代码生成
 */
public class MapperGeneratorImpl extends BaseGeneratorImpl {
    private static String LINE=System.getProperty("line.separator");

    @Override
    public void initVelocityContext(VelocityContext velocityContext, GeneratorContext generatorContext) {
        super.initVelocityContext(velocityContext, generatorContext);

        String tableName = generatorContext.getTableName();
        Connector connector = (Connector) generatorContext.getAttribute("connector");
        Map<String, String> columnNameTypeMap = connector.mapColumnNameType(tableName);
        /*List<String> allIndexes = connector.listAllIndex(tableName);*/

        List<String> resultMapColumns = Lists.newArrayList();
        List<String> whereConditions = Lists.newArrayList();
        List<String> fields = Lists.newArrayList();
        List<String> insertValueConditions = Lists.newArrayList();
        List<String> insertColsConditions = Lists.newArrayList();
        List<String> updateConditions = Lists.newArrayList();

        String pk = (String) velocityContext.get("normalPrimaryKey");
        for (String col : columnNameTypeMap.keySet()) {
            String field = GeneratorStringUtils.format(col);
            fields.add(MysqlKeywordUtil.getFieldName(col));
            StringBuilder columnBf = new StringBuilder();
            columnBf.append("<result property=\"").append(field).append("\" column=\"").append(col).append("\"/>");
            resultMapColumns.add(columnBf.toString());

            if (columnNameTypeMap.get(col).equals("Date")) {
//                StringBuilder conditionBfs = new StringBuilder();
//                conditionBfs.append("<if test=\"").append(field).append("!=null and ''!=").append(field).append("\">").append(LINE)
//                        .append("\t\t\t\t<![CDATA[").append("AND ").append(MysqlKeywordUtil.getFieldName(col)).append(" >= #{").append("dynamicFields_startTime").append("}").append("]]>").append(LINE)
//                        .append("\t\t\t</if>");
//                whereConditions.add(conditionBfs.toString());
//                StringBuilder conditionBfe = new StringBuilder();
//                conditionBfe.append("<if test=\"").append(field).append("!=null and ''!=").append(field).append("\">").append(LINE)
//                        .append("\t\t\t\t<![CDATA[").append("AND ").append(MysqlKeywordUtil.getFieldName(col)).append(" < #{").append("dynamicFields_endTime").append("}").append("]]>").append(LINE)
//                        .append("\t\t\t</if>");
//                whereConditions.add(conditionBfe.toString());
            }else {
                StringBuilder conditionBf = new StringBuilder();
                if(MysqlDatabaseMetaTypeUtil.isNumberType(columnNameTypeMap.get(col))){ //防止数字类型值为0判断失败
                    conditionBf.append("<if test=\"").append(field).append("!=null").append("\">").append(LINE)
                            .append("\t\t\t\tAND ").append(MysqlKeywordUtil.getFieldName(col)).append(" = #{").append(field).append("}").append(LINE)
                            .append("\t\t\t</if>");
                }else {
                    conditionBf.append("<if test=\"").append(field).append("!=null and ''!=").append(field).append("\">").append(LINE)
                            .append("\t\t\t\tAND ").append(MysqlKeywordUtil.getFieldName(col)).append(" = #{").append(field).append("}").append(LINE)
                            .append("\t\t\t</if>");
                }
                whereConditions.add(conditionBf.toString());

                /*boolean isKey = false;
                if (!CollectionUtils.isEmpty(allIndexes)) {
                    for (String allIndex : allIndexes) {
                        if (StringUtils.contains(allIndex, col)) {
                            isKey = true;
                            break;
                        }
                    }
                }
                if ((StringUtils.equals(field, pk) || isKey) && !StringUtils.equals(field, "id")) {
                    StringBuilder builder = new StringBuilder();
                    builder.append("<if test=\"").append(field).append("List").append("!=null and ").append(field).append("List.size()>0").append("\">").append(LINE)
                            .append("\t\t\t\tAND ").append(col).append(" IN").append(LINE)
                            .append("\t\t\t\t<foreach collection=\"").append(field).append("List\" item=\"").append(field).append("\" open=\"(\" close=\")\" separator=\",\">").append(LINE)
                            .append("\t\t\t\t\t").append("#{").append(field).append("}").append(LINE)
                            .append("\t\t\t\t</foreach>").append(LINE)
                            .append("\t\t\t</if>");
                    whereConditions.add(builder.toString());
                }*/
            }

            if (col.startsWith("gmt")) {
                insertValueConditions.add("now(),");
            } else {
                StringBuilder conditionValueBf = new StringBuilder();
                if (MysqlDatabaseMetaTypeUtil.isNumberType(columnNameTypeMap.get(col))) { //防止数字类型值为0判断失败
                    conditionValueBf.append("<if test=\"").append(field).append("!=null").append("\">").append(LINE)
                            .append("\t\t\t\t").append("#{").append(field).append("},").append(LINE)
                            .append("\t\t\t</if>");
                }else {
                    conditionValueBf.append("<if test=\"").append(field).append("!=null and ''!=").append(field).append("\">").append(LINE)
                            .append("\t\t\t\t").append("#{").append(field).append("},").append(LINE)
                            .append("\t\t\t</if>");
                }
                insertValueConditions.add(conditionValueBf.toString());
            }
            StringBuilder conditionColBf = new StringBuilder();
            if (MysqlDatabaseMetaTypeUtil.isNumberType(columnNameTypeMap.get(col))) { //防止数字类型值为0判断失败
                conditionColBf.append("<if test=\"").append(field).append("!=null").append("\">").append(LINE)
                        .append("\t\t\t\t").append(MysqlKeywordUtil.getFieldName(col)).append(",").append(LINE)
                        .append("\t\t\t</if>");
            }else {
                conditionColBf.append("<if test=\"").append(field).append("!=null and ''!=").append(field).append("\">").append(LINE)
                        .append("\t\t\t\t").append(MysqlKeywordUtil.getFieldName(col)).append(",").append(LINE)
                        .append("\t\t\t</if>");
            }
            insertColsConditions.add(conditionColBf.toString());

            if (!StringUtils.equals(pk, field)) {
                StringBuilder upBf = new StringBuilder();
                if (MysqlDatabaseMetaTypeUtil.isNumberType(columnNameTypeMap.get(col))) { //防止数字类型值为0判断失败
                    upBf.append("<if test=\"").append(field).append("!=null").append("\">").append(LINE)
                            .append("\t\t\t\t").append(MysqlKeywordUtil.getFieldName(col)).append(" = #{").append(field).append("},").append(LINE)
                            .append("\t\t\t</if>");
                }else {
                    upBf.append("<if test=\"").append(field).append("!=null and ''!=").append(field).append("\">").append(LINE)
                            .append("\t\t\t\t").append(MysqlKeywordUtil.getFieldName(col)).append(" = #{").append(field).append("},").append(LINE)
                            .append("\t\t\t</if>");
                }
                updateConditions.add(upBf.toString());
            }
        }

        velocityContext.put("resultMapColumns", resultMapColumns);
        velocityContext.put("whereConditions", whereConditions);
        velocityContext.put("insertValueConditions", insertValueConditions);
        velocityContext.put("insertColsConditions", insertColsConditions);
        velocityContext.put("updateConditions", updateConditions);
        velocityContext.put("sortByParams", "<![CDATA[${sortByParamKey} ${sortByParams[sortByParamKey]}]]>");
        velocityContext.put("fields",StringUtils.join(fields,","));
        velocityContext.put("columnPrimaryKey", generatorContext.getAttribute("columnPrimaryKey"));
    }
}
