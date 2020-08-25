package com.hux.myadapter.demo.adapter

import android.content.Context
import com.hux.myadapter.demo.R
import com.hux.myadapter.demo.BR
import com.huxlyn.regret.commons.EastAdapter

class StringAdapter(context: Context?, dataList: MutableList<String>?) :
    EastAdapter<String>(context, dataList) {

    override fun getViewItemType(position: Int): Int = R.layout.item_list_string;

    override fun bindItem(map: MutableMap<Int, Int>?) {
        map?.put(R.layout.item_list_string,BR.data);

    }
}