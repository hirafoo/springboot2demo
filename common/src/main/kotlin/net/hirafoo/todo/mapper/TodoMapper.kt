package net.hirafoo.todo.mapper

import net.hirafoo.todo.model.Todo
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update

@Mapper
interface TodoMapper {
    @Insert("""
        INSERT INTO todo (name, description, done, created_at, updated_at)
        VALUES (#{name}, #{description}, 0, UNIX_TIMESTAMP(), 0)
    """)
    fun create(name: String, description: String)

    @Select("""
        SELECT * FROM todo ORDER BY id ASC
    """)
    fun selectAll(): List<Todo>

    @Update("""
        UPDATE todo SET done = 1 WHERE id = #{id}
    """)
    fun done(id: Long)

    @Delete("""<script>
        DELETE FROM todo WHERE id = #{id}
    </script>""")
    fun delete(id: Long)
}