package com.rishabh.restApi.controller;

import com.rishabh.restApi.entry.StudentEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class StudentController {
    private Map<Long, StudentEntry> studentEntry = new HashMap<>();

    @GetMapping
    public List<StudentEntry> getEntry(){
        return new ArrayList<>(studentEntry.values());
    }

    @PostMapping
    public String createEntry(@RequestBody StudentEntry setStd){
        Long id = setStd.getId();
        studentEntry.put(id, setStd);
        return "Student with ID" + id + "Added Successfully.";
    }

    @PutMapping
    public String updateEntry(@RequestBody StudentEntry updatedStd) {
        Long id = updatedStd.getId();
        if (studentEntry.containsKey(id)) {
            studentEntry.put(id, updatedStd);
            return "Student with ID " + id + " updated successfully.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteEntry(@PathVariable Long id) {
        if (studentEntry.containsKey(id)) {
            studentEntry.remove(id);
            return "Student with ID " + id + " deleted successfully.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }

}
