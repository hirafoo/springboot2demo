package net.hirafoo.todo.mapper

import net.hirafoo.todo.model.Todo
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update
import java.time.LocalDateTime

@Mapper
interface TodoMapper {
    @Insert("""
        INSERT INTO todo (name, description, done, term, created_at, updated_at)
        VALUES (#{name}, #{description}, 0, 0, UNIX_TIMESTAMP(), 0)
    """)
    fun create(name: String, description: String, term: Int)

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

    @Select("""
        SELECT * FROM todo ORDER BY id DESC LIMIT 1
    """)
    fun getLast(): Todo

    @Select("""<script>
        SELECT   id
                ,name
                ,description
                ,done
                ,term
                ,created_at
                ,updated_at
        FROM    todo
        WHERE   id = #{id}
    </script>""")
    fun retrieve(id: Long): Todo

    @Update("""<script>
        UPDATE todo
        SET
             name = #{name}
            ,description = #{description}
            ,done = #{done}
            ,term = #{term}
        WHERE id = #{id}
    </script>""")
    fun edit(
        id: Long,
        name: String,
        description: String,
        done: Boolean,
        term: Int
    )

    @Delete("""TRUNCATE todo""")
    fun truncate()
}
