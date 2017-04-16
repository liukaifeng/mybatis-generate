package org.mybatis.generator;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * All rights Reserved, Designed By www.slyun.com
 *
 * @Package org.mybatis.generator
 * @Description:菜单管理服务接口
 * @Author: 刘凯峰
 * @Date: 2017年-04月-15日 23:31
 * @Version V1.0
 */
public class StartUp {
	public static void main(String[] args) throws URISyntaxException {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			//直接获取generatorConfig.xml的文件路径 根据具体情况查看
			File configFile = new File("D:\\MyCode\\workspace\\idea2017\\mybatis-generate\\src\\main\\resources\\mybatis-generator.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		}
	}
}

