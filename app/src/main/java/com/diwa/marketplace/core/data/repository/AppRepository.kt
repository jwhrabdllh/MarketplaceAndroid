package com.diwa.marketplace.core.data.repository

import com.diwa.marketplace.core.data.source.local.LocalData
import com.diwa.marketplace.core.data.source.remote.RemoteData

class AppRepository(val local: LocalData, val remote: RemoteData) {
}