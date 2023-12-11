package com.meonlybusiness.projectbrother.Authentication;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

public class AuthenticationHandler implements IAuthentication {

    private FirebaseAuth mAuth;

    public AuthenticationHandler()
    {
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void Login()
    {

    }

    @Override
    public void Register(String email, String password, Function<String, Boolean> callback)
    {
        mAuth.createUserWithEmailAndPassword(email, password);
                /*.addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            //String message = Objects.requireNonNull(task.getResult().getUser()).getEmail();
                            //callback.apply(message);
                        } else {
                            //String message = Objects.requireNonNull(task.getResult().getUser()).getEmail();
                            //callback.apply(message);
                        }
                    }
                });*/
    }

    @Override
    public boolean IsAuthenticated()
    {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null)
        {
            return true;
        }

        return false;
    }

}
