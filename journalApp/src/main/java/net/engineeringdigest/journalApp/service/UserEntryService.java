package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.UserEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.repository.UserEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserEntryService {

@Autowired
    private UserEntryRepository userEntryRepository;

    public void saveEntry(UserEntry userEntry){
        userEntryRepository.save(userEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
}
