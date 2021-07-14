package com.amazon.tv.leanbacklauncher.notifications

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

class RecCardMetaDataView : RelativeLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun setVisibility(visibility: Int) {
        super.setVisibility(VISIBLE)
    }
}