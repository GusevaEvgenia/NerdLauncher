package com.android_lessons.belkin.nerdlauncher;

import android.support.v4.app.Fragment;


public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new NerdLauncherFragment();
    }


}
