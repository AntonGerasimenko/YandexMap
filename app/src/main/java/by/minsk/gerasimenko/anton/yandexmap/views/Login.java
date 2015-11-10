package by.minsk.gerasimenko.anton.yandexmap.views;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import android.widget.EditText;


import butterknife.ButterKnife;
import butterknife.OnClick;
import by.minsk.gerasimenko.anton.yandexmap.R;

/**
 * Created by gerasimenko on 10.11.2015.
 */
public class Login extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login,container,false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick({R.id.login,R.id.password})
    public void clear(EditText text){

        text.setText("");
    }

    @OnClick(R.id.cancel)
    public void exit(){
        dismiss();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
