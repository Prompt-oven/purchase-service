package com.promptoven.purchaseservice.common.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@NoArgsConstructor
@Entity
public class PurchaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("주문 UUID")
    @Column(nullable = false, length = 50)
    private String purchaseUuid;

    @Comment("상품 UUID")
    @Column(nullable = false, length = 50)
    private String productUuid;

    @Comment("리뷰 작성 여부")
    @Column(nullable = false)
    private boolean writtenReview;

    @Builder
    public PurchaseProduct(String purchaseUuid, String productUuid, boolean writtenReview) {
        this.purchaseUuid = purchaseUuid;
        this.productUuid = productUuid;
        this.writtenReview = writtenReview;
    }
}
