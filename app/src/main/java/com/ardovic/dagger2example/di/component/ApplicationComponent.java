package com.ardovic.dagger2example.di.component;

import android.app.Application;
import android.content.Context;

import com.ardovic.dagger2example.DemoApplication;
import com.ardovic.dagger2example.data.DataManager;
import com.ardovic.dagger2example.data.DbHelper;
import com.ardovic.dagger2example.data.SharedPrefsHelper;
import com.ardovic.dagger2example.di.ApplicationContext;
import com.ardovic.dagger2example.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
