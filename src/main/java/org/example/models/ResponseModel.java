package org.example.models;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public record ResponseModel(
        List<FirstObjectModel> firstObject,
        SecondObjectModel secondObject
) {}
