package com.viathink.frame.core.status;

/**
 * 状态枚举类型
 * @author LiuJunGuang
 * @date 2014年3月4日下午5:26:44
 */
public enum EnumStatus implements BaseEnum {
	ON("启用"), OFF("注销");

	private EnumStatus(String label) {
		this.label = label;
	}

	private String label;

	@Override
	public String getLabel() {
		return this.label;
	}

}
