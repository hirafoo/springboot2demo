package net.hirafoo.todo.mapper

import net.hirafoo.todo.model.Todo
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update
import java.util.Optional

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

    @Select("""
        SELECT * FROM todo ORDER BY id DESC LIMIT 1
    """)
    fun getLast(): Todo

    @Select("""<script>
        select   id
                ,name
                ,description
                ,done
                ,created_at
                ,updated_at
        from    todo
        where   id = #{id}
    </script>""")
    fun retrieve(id: Long): Todo

    @Update("""<script>
        UPDATE todo
        SET
        <if test="name != null">
            name = #{name}
        </if>
        <if test="description != null">
            <if test="name != null">
            ,
            </if>
            description = #{description}
        </if>
        WHERE id = #{id}
    </script>""")
    fun edit(id: Long, name: String?, description: String?)

    @Delete("""TRUNCATE todo""")
    fun truncate()
}
