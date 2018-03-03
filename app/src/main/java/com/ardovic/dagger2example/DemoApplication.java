package com.ardovic.dagger2example;

import android.app.Application;
import android.content.Context;

import com.ardovic.dagger2example.data.DataManager;
import com.ardovic.dagger2example.di.component.ApplicationComponent;
import com.ardovic.dagger2example.di.component.DaggerApplicationComponent;
import com.ardovic.dagger2example.di.module.ApplicationModule;

import javax.inject.Inject;

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
