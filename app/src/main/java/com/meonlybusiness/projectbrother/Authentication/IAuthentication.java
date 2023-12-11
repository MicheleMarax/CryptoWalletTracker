package com.meonlybusiness.projectbrother.Authentication;

import android.text.Editable;

import java.util.function.Consumer;
import java.util.function.Function;

public interface IAuthentication {

    public void Login();
    public void Register(String email, String password, Function<String, Boolean> callback);
    public boolean IsAuthenticated();

}
