package com.gsl.mycontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModal> arrContacts = new ArrayList<>();
    RecyclerContactAdapter adapter;
    RecyclerView recyclerView;
    FloatingActionButton btnOpenDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerContact);
        btnOpenDialog = findViewById(R.id.buttonOpenDialog);



        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = "", number = "";
                        if (!edtName.getText().toString().equals("")){
                             name = edtName.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this, "Please Enter Contact Name", Toast.LENGTH_SHORT).show();
                        }

                        if (!edtNumber.getText().toString().equals("")){
                            number = edtNumber.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this, "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
                        }

                        arrContacts.add(new ContactModal(R.drawable.b, name, number));
                        adapter.notifyItemInserted(arrContacts.size()-1);

                        recyclerView.scrollToPosition(arrContacts.size()-1);

                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModal(R.drawable.b, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Virat Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Ramji Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Nimit Nagre","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Viraj Nagore","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Shyam More","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Kapil Bhalavi","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Virat Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Ramji Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Nimit Nagre","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Viraj Nagore","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Shyam More","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Kapil Bhalavi","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.c, "Aman Kohli","7682824421"));
        arrContacts.add(new ContactModal(R.drawable.b, "Aman Kohli","7682824421"));

        adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}