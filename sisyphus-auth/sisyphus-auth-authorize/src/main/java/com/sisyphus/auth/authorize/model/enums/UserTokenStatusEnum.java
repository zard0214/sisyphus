package com.sisyphus.auth.authorize.model.enums;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.List;

/**
 * @author zhecheng.zhao
 * @date Created in 22/06/2021 21:07
 */
@Getter
public enum UserTokenStatusEnum {

    /**
     * 启用
     */
    ON_LINE(0, "在线"),
    /**
     * 已刷新
     */
    ON_REFRESH(10, "已刷新"),
    /**
     * 离线
     */
    OFF_LINE(20, "离线");

    /**
     * The Status.
     */
    int status;
    /**
     * The Value.
     */
    String value;

    /**
     * Gets name.
     *
     * @param status the status
     *
     * @return the name
     */
    public static String getName(int status) {
        for (UserTokenStatusEnum ele : UserTokenStatusEnum.values()) {
            if (status == ele.getStatus()) {
                return ele.getValue();
            }
        }
        return null;
    }

    UserTokenStatusEnum(int status, String value) {
        this.status = status;
        this.value = value;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    private static List<Integer> getStatusList() {
        List<Integer> list = Lists.newArrayList();
        for (UserTokenStatusEnum ele : UserTokenStatusEnum.values()) {
            list.add(ele.getStatus());
        }
        return list;
    }

    /**
     * Contains boolean.
     *
     * @param status the status
     *
     * @return the boolean
     */
    public static boolean contains(Integer status) {
        List<Integer> statusList = getStatusList();
        return statusList.contains(status);
    }
}
