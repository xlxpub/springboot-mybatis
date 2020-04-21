package chapter2.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author xueleixi
 * @date 2020-04-21 07:09
 * app容易入口配置文件
 */
@Configuration
@Import({CarConfig.class})
public class AppConfig
{
}
