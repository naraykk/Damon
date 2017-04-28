package com.zyhang.damon.kotlin

/**
 * ProjectName:Damon
 * Description:
 * Created by zyhang on 2017/4/28.下午5:52
 * Modify by:
 * Modify time:
 * Modify remark:
 */

interface PresenterFactory<out P : MvpPresenter<MvpView>> {
    fun createPresenter(): P?
}