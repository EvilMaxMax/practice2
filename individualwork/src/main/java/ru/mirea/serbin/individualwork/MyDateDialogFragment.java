package ru.mirea.serbin.individualwork;

import android.app.DatePickerDialog;
import java.util.Calendar;

public class MyDateDialogFragment {
    Calendar date= Calendar.getInstance();
    DatePickerDialog.OnDateSetListener d= (view, year, monthOfYear, dayOfMonth) -> {
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, monthOfYear);
        date.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    };
}