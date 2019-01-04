package net.hirafoo.todo.service;

import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        log.info("{}", list);
        return list;
    }
}
