package com.example.animalsapp;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalsFragment extends Fragment {

    ArrayList<Animal> animals;

    public AnimalsFragment() {
        super(R.layout.fragment_animals);
    }

    @Override
    public void onStart() {
        super.onStart();
        RecyclerView rvContacts =  (RecyclerView) getView().findViewById(R.id.rvContacts);
        animals = Animal.createAnimalsList();
        AnimalsAdapter adapter = new AnimalsAdapter(animals);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }
}
