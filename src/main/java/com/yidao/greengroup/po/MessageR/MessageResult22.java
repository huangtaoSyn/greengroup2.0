package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T22;
import com.yidao.greengroup.po.Enginer.T22Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult22 {
	public T22 t22 ;
	public List<T22Switch> list;

	public MessageResult22(T22 t22, List<T22Switch> list) {
		this.t22 = t22;
		this.list = list;
	}

	public T22 getT22() {
		return t22;
	}

	public void setT22(T22 t22) {
		this.t22 = t22;
	}

	public List<T22Switch> getList() {
		return list;
	}

	public void setList(List<T22Switch> list) {
		this.list = list;
	}
}
