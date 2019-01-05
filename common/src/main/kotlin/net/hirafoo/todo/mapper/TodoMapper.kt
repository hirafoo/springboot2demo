package net.hirafoo.todo.mapper

import net.hirafoo.todo.model.Todo
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface TodoMapper {
    @Insert("""
        INSERT INTO todo (name, description, created_at, updated_at)
        VALUES (#{name}, #{description}, UNIX_TIMESTAMP(), 0)
    """)
    fun create(name: String, description: String)

    @Select("""
        SELECT * FROM todo ORDER BY id ASC
    """)
    fun selectAll(): List<Todo>

    @Delete("""<script>
        DELETE FROM todo WHERE id = #{id}
    </script>""")
    fun delete(id: Long)
}