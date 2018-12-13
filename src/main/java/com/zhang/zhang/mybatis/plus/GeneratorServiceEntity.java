package com.zhang.zhang.mybatis.plus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class GeneratorServiceEntity  {
	public static void main(String[] args) {

		String[] tableNames = new String[] { "bj_user" }; 
		generateByTables(tableNames);
	}
	
	private static void generateByTables(String[] tableNames) {
		// 创建代码生成器
		AutoGenerator generator = new AutoGenerator();
		// 全局配置
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setAuthor("张铁志")
				.setOutputDir("d:\\mybatisPlus")
				.setEnableCache(false)
				.setFileOverride(true)
				.setServiceName("%sService")
				.setControllerName("%sController")
				.setMapperName("%sDao")
				.setXmlName("%sMapper");
		generator.setGlobalConfig(globalConfig);
		// 数据源配置
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.SQL_SERVER)
				.setUrl("jdbc:sqlserver://192.168.1.101:1433;DatabaseName=Pay")
				.setUsername("sa")
				.setPassword("123456")
				.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		generator.setDataSource(dataSourceConfig);
		// 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.zhang.zhang")
        		.setController("controller")
				.setEntity("entity")
				.setMapper("dao")
				.setXml("mapper");
        generator.setPackageInfo(packageConfig);
        
        StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig.setCapitalMode(true)
				.setEntityLombokModel(false)
				.setNaming(NamingStrategy.underline_to_camel)
				.setInclude(tableNames)
				.setSuperEntityClass("com.zhang.zhang.entity.BaseEntity")
				// .setSuperServiceClass("com.baojian.pda.service.BaseService")
				// .setSuperServiceImplClass("com.baojian.pda.service.impl.BaseServiceImpl")
				.setSuperEntityColumns(new String[] { "id", "create_date", "update_date", "remark", "del_flag" });
		generator.setStrategy(strategyConfig);
		
		generator.execute();
	}
}
