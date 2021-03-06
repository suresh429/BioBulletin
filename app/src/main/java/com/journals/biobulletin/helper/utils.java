package com.journals.biobulletin.helper;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;

import androidx.appcompat.app.AlertDialog;
import androidx.browser.customtabs.CustomTabsIntent;

import com.journals.biobulletin.BuildConfig;
import com.journals.biobulletin.R;

import static android.content.Intent.ACTION_VIEW;
import static android.content.Intent.CATEGORY_BROWSABLE;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static android.content.Intent.FLAG_ACTIVITY_REQUIRE_NON_BROWSER;


public class utils {
    public static Boolean isNetworkAvailable(Context application) {
        ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }

    public static void noNetworkAlert(Activity activity, String message) {

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setTitle("No internet Connection");
        builder.setMessage(message);
        builder.setNegativeButton("close", (dialog, which) -> {
            activity.finish();
            System.exit(0);
        });
        // builder.setNegativeButton("close", (dialog, which) -> dialog.dismiss());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


    public static void viewInBrowser(Context context, String url, String message) {

        /*Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.addCategory(CATEGORY_BROWSABLE);
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_REQUIRE_NON_BROWSER);

         if (null != intent.resolveActivity(context.getPackageManager())) {
            context.startActivity(intent);
        } else {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }*/



        try {
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            // The URL should either launch directly in a non-browser app (if it's the
            // default), or in the disambiguation dialog.
            intent.addCategory(CATEGORY_BROWSABLE);
            intent.setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_REQUIRE_NON_BROWSER);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            // Only browser apps are available, or a browser is the default.
            // So you can open the URL directly in your app, for example in a
            // Custom Tab.

            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(context, Uri.parse(url));
        }

    }


    public static void shareMyApp(Context context) {

        try {
            String shareMessage = "\nLet me recommend you this application\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, context.getResources().getString(R.string.app_name));
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            context.startActivity(Intent.createChooser(shareIntent, "choose one"));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
