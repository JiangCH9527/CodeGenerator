package com.weidong.mybatis.start;

import com.weidong.mybatis.generator.Generator;
import com.weidong.mybatis.generator.context.GeneratorContext;

import java.util.Map;

/**
 * 功能描述：自动化生成代码插件执行实现
 */
public class PluginGeneratorStarter extends DefaultGeneratorStarter {

    @Override
    protected void doGeneratorService(Generator generator, GeneratorContext generatorContext, Map<String,String> allPackageNameMap) {
        generator.pluginGenerator(generatorContext,allPackageNameMap);
    }
}
