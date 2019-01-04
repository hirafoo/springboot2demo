package net.hirafoo.todo.service;

import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class TodoService {

    private static String DBFILE = "/tmp/todo.list";

    public List<Todo> getAll() {
        List<Todo> list = new ArrayList<>();

        try {
            File file = new File(DBFILE);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                log.info("{}", line);
                String[] data = line.split(",");
                Todo todo = new Todo(
                        Long.parseLong(data[0]),
                        data[1],
                        data[2]
                );
                list.add(todo);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Todo create(String name, String description) {
        List<Todo> list = getAll();
        Todo lastTodo = list.get(list.size() - 1);
        Long id = lastTodo.getId() + 1;
        Todo newTodo = new Todo(id, name, description);

        try {
            File file = new File(DBFILE);
            FileWriter fileWriter = new FileWriter(file, true);
            List<String> newline = Arrays.asList(id.toString(), name, description, "\n");
            fileWriter.write(String.join(",", newline));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newTodo;
    }

    public void delete(Long id) {
        //tbd
    }
}
