package com.rzk;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class generatorTest {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        FastAutoGenerator.create("jdbc:mysql://:3310/cloud2021?characterEncoding=utf8&serverTimezone=UTC","root","")
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名称？"))
                        .outputDir(projectPath))// 指定输出目录

                // 包配置
                .packageConfig((scanner, builder)
                        -> builder.parent(scanner.apply("请输入包名？"))
                        .moduleName(scanner.apply("请输入父包模块名？"))
                        .pathInfo(Collections.singletonMap(OutputFile.xml, "/src/main/resources/com/rzk/mapper/"))

                )
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(
                                getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()
                        .entityBuilder().enableLombok().addTableFills(
                                new Column("create_time", FieldFill.INSERT)
                        )
                        //开启重新生成覆盖
                        .controllerBuilder().enableFileOverride()//开启重新生成覆盖  官方源码说fileOverride后续会做删除 ,后续用这个替换enableFileOverride
                        .serviceBuilder().enableFileOverride()//开启重新生成覆盖
                        .entityBuilder().enableFileOverride()//开启重新生成覆盖
                        .mapperBuilder().enableFileOverride()//开启重新生成覆盖
                        .build())
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
                .execute();


    }
    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
