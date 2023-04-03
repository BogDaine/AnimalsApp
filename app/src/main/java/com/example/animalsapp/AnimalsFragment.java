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
        // Lookup the recyclerview in activity layout
        RecyclerView rvContacts =  (RecyclerView) getView().findViewById(R.id.rvContacts);

        // Initialize contacts
        animals = Animal.createAnimalsList(20);
        // Create adapter passing in the sample user data
        AnimalsAdapter adapter = new AnimalsAdapter(animals);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this.getContext()));
        // That's all!
    }
}
