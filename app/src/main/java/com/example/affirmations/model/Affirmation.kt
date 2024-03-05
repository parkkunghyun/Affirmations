package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    // 요소의 값이 이 애너테이션들이 의미하는 리소스 타입에 해당하는 리소스의 아이디임을 의미함

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
