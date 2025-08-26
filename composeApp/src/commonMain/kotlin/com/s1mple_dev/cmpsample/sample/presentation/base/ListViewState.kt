package com.s1mple_dev.cmpsample.sample.presentation.base

import com.s1mple_dev.cmpsample.core.domain.AppResult

sealed class ListViewState {
    object Loading : ListViewState()
    object Empty : ListViewState()
    data class Failure(val result: AppResult.Failure) : ListViewState()

    class ListResult<TListItemModel : BaseListItem>(
        val items: List<TListItemModel>
    ) : ListViewState()
}