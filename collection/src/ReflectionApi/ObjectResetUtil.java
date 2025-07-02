package ReflectionApi;

import java.lang.reflect.Field;

public class ObjectResetUtil {

    public static void nullifyFields(Object obj) {
        if (obj == null) return;

        Class<?> clazz = obj.getClass();
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) ||
                        field.getType().isPrimitive()) {
                    continue;
                }
                field.setAccessible(true);
                try {
                    field.set(obj, null);
                } catch (IllegalAccessException e) {
                    System.err.println("Не удалось обнулить поле: " + field.getName());
                }
            }

            clazz = clazz.getSuperclass();
        }
    }
}
