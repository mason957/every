/**
 * @autheor: Mason
 * @date:2022/1/18 14:30
 */

package cn.wjc.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private Integer age;
    private String sex;
    private Long id;
}
