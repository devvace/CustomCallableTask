package com.dwp.asynctaskreplacesample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.dwp.asynctaskreplacesample.NetworkTask;
import com.dwp.asynctaskreplacesample.R;
import com.dwp.asynctaskreplacesample.TaskRunner;

public class MainActivity extends AppCompatActivity implements iOnDataFetched {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaskRunner runner = new TaskRunner();
        runner.executeAsync(new NetworkTask(this));
    }

    @Override
    public void showProgressBar() {
        Log.e("TAG", "showProgressBar()");
    }

    @Override
    public void hideProgressBar() {
        Log.e("TAG", "hideProgressBar()");
    }

    @Override
    public void setDataInPageWithResult(Object result) {
        Log.e("TAG", "setDataInPageWithResult() :: " + result);
    }
}


/** OLD  **/
//public class MyAsyncTask extends AsyncTask<Void, Void, String> {
//    WeakReference<MyInterface> myInterfaceWeakReference;
//
//    public MyAsyncTask(MyInterface listener) {
//        this.myInterfaceWeakReference = new WeakReference<>(listener);
//    }
//
//    @Override
//    protected void onPreExecute() {
//        if(myInterfaceWeakReference != null && myInterfaceWeakReference.get() != null) {
//            myInterfaceWeakReference.get().doWorkBeforeBackground();
//        }
//    }
//
//    @Override
//    protected String doInBackground(Void... voids) {
//        String result = someNetworkFunction();
//        return result;
//    }
//
//    @Override
//    protected void onPostExecute(String s) {
//        if(myInterfaceWeakReference != null && myInterfaceWeakReference.get() != null) {
//            myInterfaceWeakReference.get().doWorkAfterBackground((String)s);
//        }
//    }
//
//    interface MyInterface {
//        void doWorkBeforeBackground();
//        void doWorkAfterBackground(Object result);
//    }
//}
