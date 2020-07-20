package com.dwp.asynctaskreplacesample;

import android.util.Log;

/**
 * Created by dwp on 2020-06-01.
 */
public abstract class BaseTask<R> implements CustomCallable<R> {
    @Override
    public void setUiForLoading() {
    }

    @Override
    public void setDataAfterLoading(R result) {
    }

    @Override
    public R call() throws Exception {
        return null;
    }
}
