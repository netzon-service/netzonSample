package com.netzon.sample

import com.facebook.yoga.YogaAlign
import android.text.Layout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.widget.Text
import com.facebook.litho.ComponentContext
import com.facebook.yoga.YogaEdge.ALL
import com.facebook.litho.Component

@LayoutSpec
object ButtonTextSpec {

    @OnCreateLayout
    fun onCreateLayout(
        c: ComponentContext,
        @Prop text: String): Component =
        Text.create(c)
            .text(text)
            .textSizeDip(18f)
            .textColorRes(android.R.color.white)
            .textSizeSp(18f)
            .textAlignment(Layout.Alignment.ALIGN_CENTER)
            .alignSelf(YogaAlign.STRETCH)
            .paddingDip(ALL, 8f)
            .build()
}