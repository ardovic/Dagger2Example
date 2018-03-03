package com.ardovic.dagger2example.di.component;

import com.ardovic.dagger2example.MainActivity;
import com.ardovic.dagger2example.di.PerActivity;
import com.ardovic.dagger2example.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
