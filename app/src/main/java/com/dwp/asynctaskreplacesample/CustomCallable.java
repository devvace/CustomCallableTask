package com.dwp.asynctaskreplacesample;

import java.util.concurrent.Callable;

/**
 * Created by dwp on 2020-06-01.
 */
public interface CustomCallable<R> extends Callable<R> {
    void setDataAfterLoading(R result);
    void setUiForLoading();
}
