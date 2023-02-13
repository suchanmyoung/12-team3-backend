package com.depromeet.ahmatda.template.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TemplateDeleteItemRequest {
    @NotNull(message = "템플릿을 확인해주세요.")
    private Long templateId;

    @NotNull(message = "삭제할 소지품을 확인해주세요.")
    private Long itemId;
}
