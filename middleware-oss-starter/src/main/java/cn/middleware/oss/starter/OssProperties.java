package cn.middleware.oss.starter;

import cn.middleware.oss.core.OssConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * OSS配置类
 * 
 * @author lry 
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties(prefix = "oss")
public class OssProperties extends OssConfig {

}