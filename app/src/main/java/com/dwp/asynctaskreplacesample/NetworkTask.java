package com.dwp.asynctaskreplacesample;

import android.util.Log;

import com.dwp.asynctaskreplacesample.ui.iOnDataFetched;

/**
 * Created by dwp on 2020-06-01.
 */
public class NetworkTask extends BaseTask {
    private final iOnDataFetched listener;

    public NetworkTask(iOnDataFetched onDataFetchedListener) {
        this.listener = onDataFetchedListener;
    }

    @Override
    public Object call() throws Exception {
        Object result;
        result = someNetworkFunction();
        return result;
    }

    @Override
    public void setUiForLoading() {
        listener.showProgressBar();
    }

    @Override
    public void setDataAfterLoading(Object result) {
        listener.setDataInPageWithResult(result);
        listener.hideProgressBar();
    }
    private String someNetworkFunction() {
        Log.e("TAG", "someNetworkFunction !!");
        return "실제 실행 함수 부분";
    }
}


