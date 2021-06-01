package com.rabbitmq.consumer.rabbitmqconsumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Onemg {

    public Data data;
    public boolean partial_complete;
    public boolean is_success;
    public int status_code;
    public Meta meta;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class RxRequired{
        public String header;
        public String icon_url;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Add{
        public String action_label;
        public String final_label;
        public String label;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class CartActions{
        public List<String> dweb;
        public List<String> mweb;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class InStock{
        public Add add;
        public CartActions cart_actions;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Sku{
        public boolean is_discontinued;
        public String manufacturer_name;
        public String type;
        public double price;
        public String name;
        public int id;
        public int sku_id;
        public boolean available;
        public String pack_size_label;
        public RxRequired rx_required;
        public String slug;
        public String short_composition;
        public String image_url;
        public InStock in_stock;
        public int quantity;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class ItemListElement{
        @JsonProperty("@type")
        public String type;
        public int position;
        public String url;
        public String name;
        public String image;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Schema{
        @JsonProperty("@context")
        public String context;
        @JsonProperty("@type")
        public String type;
        public String url;
        public String name;
        public int numberOfItems;
        public List<ItemListElement> itemListElement;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class HeaderInfo{
        public String header;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class MetaData{
        public String title;
        public String description;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Data{
        public List<Sku> skus;
        public Schema schema;
        public HeaderInfo header_info;
        public MetaData meta_data;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Meta{
        public int count;
        public int total_count;
    }

}


