package cn.mmc8102.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangli
 */
@Data
@AllArgsConstructor
public class HeaderStatus implements Serializable {

    private int code;
    private String desc;

    public static final HeaderStatus SUCCESS = new HeaderStatus(200, "OK");

}
