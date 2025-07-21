# Java Encapsulation - Lab

## Lab Description

In this lab we paractice **Java encapsulation**.

We use the **access modifiers** (`public`, `protected`, `private`, and the default package-private),
to test when and where to use them 
and how they restrict access to the class, attribute, or method they are applied to.

## Access Modifiers

An **access modifier** defines the visibility of the class, field/attribute, or method it is applied to:

- `private`: accessible only in the class in which it is defined.
- default (no access modifier specified) is also known as *package-private*, accessible only in the *package* it is defined in. To use package-private we do not specify any access modifier.
- `protected`: accessible only in:
    - the same *package*
    - the same *class*
    - the *subclasses*
- `public`: accessible *everywhere* to *everyone*

| Access Modifier | Same Class | Class in the same package | Class in another package | Subclass in the same package | Subclass in another package |
| --------------- | ---------- | ------------------------- | ------------------------ | ---------------------------- | --------------------------- |
| `public`        | ✅          | ✅                         | ✅                        | ✅                            | ✅                           |
| `private`       | ✅          | ❌                         | ❌                        | ❌                            | ❌                           |
| `protected`     | ✅          | ❌                         | ❌                        | ✅                            | ✅                           |
| package-private | ✅          | ✅                         | ❌                        | ✅                            | ❌                           |
