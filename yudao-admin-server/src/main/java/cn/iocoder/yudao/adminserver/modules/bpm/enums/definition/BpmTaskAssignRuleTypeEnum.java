package cn.iocoder.yudao.adminserver.modules.bpm.enums.definition;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * BPM 任务分配规则的类型枚举
 *
 * @author 芋道源码
 */
@Getter
@AllArgsConstructor
public enum BpmTaskAssignRuleTypeEnum {

    ROLE(10, "角色"),

    DEPT(20, "部门的成员"),
    DEPT_LEADER(21, "部门的负责人"),

    USER(30, "用户"),

    USER_GROUP(40, "用户组"), // TODO 芋艿：预留，暂未实现

    SCRIPT(50, "自定义脚本"), // 例如说，发起人所在部门的领导、发起人所在部门的领导的领导
    ;

    /**
     * 类型
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String desc;

}