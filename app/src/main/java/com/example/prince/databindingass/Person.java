package com.example.prince.databindingass;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Person extends BaseObservable {
    String name;
    String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    //step1
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        //step2
//        notifyPropertyChanged(BR.name);
    }

    //step1
    @Bindable
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;

        //step2
//        notifyPropertyChanged(BR.occupation);
    }
}