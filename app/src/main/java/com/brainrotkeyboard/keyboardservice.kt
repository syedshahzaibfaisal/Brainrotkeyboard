package com.brainrotkeyboard

import android.inputmethodservice.InputMethodService
import android.view.View

class KeyboardService : InputMethodService() {
    override fun onCreateInputView(): View {
        return View(this)
    }
}

