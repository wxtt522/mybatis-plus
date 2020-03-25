package com.example.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sin
 * @since 2020-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TDict extends Model<TDict> {

    private static final long serialVersionUID = 1L;

    private String dictId;

    private String dictName;

    private String describeInfo;

    private String createTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
