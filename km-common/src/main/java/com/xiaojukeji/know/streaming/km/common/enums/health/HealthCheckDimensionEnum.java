package com.xiaojukeji.know.streaming.km.common.enums.health;

import lombok.Getter;

/**
 * @author zengqiao
 * @date 22/03/01
 */
@Getter
public enum HealthCheckDimensionEnum {
    UNKNOWN(-1, "未知"),

    CLUSTER(0, "Cluster维度"),

    BROKER(1, "Broker维度"),

    TOPIC(2, "Topic维度"),

    GROUP(3, "消费组维度"),

    ;

    private final int dimension;

    private final String message;

    HealthCheckDimensionEnum(int dimension, String message) {
        this.dimension = dimension;
        this.message = message;
    }

    public static HealthCheckDimensionEnum getByCode(Integer dimension) {
        if (dimension == null) {
            return UNKNOWN;
        }

        for (HealthCheckDimensionEnum dimensionEnum: HealthCheckDimensionEnum.values()) {
            if (dimensionEnum.getDimension() == dimension) {
                return dimensionEnum;
            }
        }

        return UNKNOWN;
    }
}
