package com.netzon.sample

import android.view.View
import com.facebook.litho.annotations.Prop
import com.facebook.litho.annotations.FromEvent
import com.facebook.litho.ClickEvent
import com.facebook.litho.annotations.OnEvent
import com.facebook.yoga.YogaAlign
import com.facebook.yoga.YogaJustify
import com.facebook.litho.Column
import com.facebook.litho.Component
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.ComponentContext
import com.facebook.litho.widget.Card
import android.R
import android.util.Log

@LayoutSpec
object ButtonContainerSpec {

    @OnCreateLayout
    fun onCreateLayout(
        c: ComponentContext): Component =
        Column.create(c)
            .alignItems(YogaAlign.CENTER)
            .justifyContent(YogaJustify.CENTER)
            .child(
                Card.create(c)
                    .cardBackgroundColorRes(R.color.holo_blue_light)
                    .cornerRadiusDip(2f)
                    .elevationDip(2f)
                    .content(ButtonText.create(c).text("Button"))
                    .flexShrink(1f)
                    .alignSelf(YogaAlign.CENTER)
            )
            .clickHandler(ButtonContainer.onClick(c))
            .build()

    @OnEvent(ClickEvent::class)
    fun onClick(
        c: ComponentContext,
        @FromEvent view: View,
        @Prop listener: OnButtonClickListener
    ) {
        listener.onButtonClick()
    }

    interface OnButtonClickListener {
        fun onButtonClick()
    }
}