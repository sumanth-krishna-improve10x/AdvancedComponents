package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    public ArrayList<Contact> contacts;
    ListView listViewContactLv;
    ArrayAdapter<Contact> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contact");
        handleAddButton();
        setUpData();
        setUpListContacts();
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
           // arrayAdapter.add(name);
            //arrayAdapter.notifyDataSetChanged();
            EditText phoneNumberTxt = findViewById(R.id.phone_number_txt);
            String phoneNumber = phoneNumberTxt.getText().toString();
            //arrayAdapter.add(phoneNumber);
            //arrayAdapter.notifyDataSetChanged();
            Toast.makeText(this, name + phoneNumber, Toast.LENGTH_SHORT).show();
        });
    }

    private void setUpListContacts() {
        listViewContactLv = findViewById(R.id.list_view_contact_lv);
        arrayAdapter = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1, contacts);

    }

    public void setUpData() {
        contacts = new ArrayList<Contact>();
        Contact contact1 = new Contact();
        contact1.name = "vissu";
        contact1.phoneNumber = "9989763578";
        contacts.add(contact1);
        Contact contact2 = new Contact();
        contact2.name = "Renuka";
        contact2.phoneNumber = "987654324";
        contacts.add(contact2);
    }
}