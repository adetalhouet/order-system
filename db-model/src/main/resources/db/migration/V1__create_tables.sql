--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2 (Debian 12.2-2.pgdg100+1)
-- Dumped by pg_dump version 12.2 (Debian 12.2-2.pgdg100+1)

--
-- Name: cartitems; Type: TABLE; Schema: public; Owner: order-system
--

CREATE TABLE public.cartitems
(
    id          bigint           NOT NULL,
    product_id  bigint,
    quantity    integer          NOT NULL,
    total_price double precision NOT NULL
);


ALTER TABLE public.cartitems
    OWNER TO "order-system";

--
-- Name: cartitems_id_seq; Type: SEQUENCE; Schema: public; Owner: order-system
--

CREATE SEQUENCE public.cartitems_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cartitems_id_seq
    OWNER TO "order-system";

--
-- Name: cartitems_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: order-system
--

ALTER SEQUENCE public.cartitems_id_seq OWNED BY public.cartitems.id;


--
-- Name: carts; Type: TABLE; Schema: public; Owner: order-system
--

CREATE TABLE public.carts
(
    id          bigint           NOT NULL,
    items       text             NOT NULL,
    total_price double precision NOT NULL
);


ALTER TABLE public.carts
    OWNER TO "order-system";

--
-- Name: carts_id_seq; Type: SEQUENCE; Schema: public; Owner: order-system
--

CREATE SEQUENCE public.carts_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.carts_id_seq
    OWNER TO "order-system";

--
-- Name: carts_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: order-system
--

ALTER SEQUENCE public.carts_id_seq OWNED BY public.carts.id;


--
-- Name: clients; Type: TABLE; Schema: public; Owner: order-system
--

CREATE TABLE public.clients
(
    id           bigint                 NOT NULL,
    email        character varying(80)  NOT NULL,
    password     character varying(20)  NOT NULL,
    address      character varying(100) NOT NULL,
    date_created bigint                 NOT NULL
);


ALTER TABLE public.clients
    OWNER TO "order-system";

--
-- Name: clients_id_seq; Type: SEQUENCE; Schema: public; Owner: order-system
--

CREATE SEQUENCE public.clients_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clients_id_seq
    OWNER TO "order-system";

--
-- Name: clients_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: order-system
--

ALTER SEQUENCE public.clients_id_seq OWNED BY public.clients.id;


--
-- Name: orders; Type: TABLE; Schema: public; Owner: order-system
--

CREATE TABLE public.orders
(
    id           bigint  NOT NULL,
    state        integer NOT NULL,
    client_id    bigint,
    cart_id      bigint,
    date_created bigint  NOT NULL
);


ALTER TABLE public.orders
    OWNER TO "order-system";

--
-- Name: orders_id_seq; Type: SEQUENCE; Schema: public; Owner: order-system
--

CREATE SEQUENCE public.orders_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.orders_id_seq
    OWNER TO "order-system";

--
-- Name: orders_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: order-system
--

ALTER SEQUENCE public.orders_id_seq OWNED BY public.orders.id;


--
-- Name: products; Type: TABLE; Schema: public; Owner: order-system
--

CREATE TABLE public.products
(
    id           bigint                NOT NULL,
    name         character varying(80) NOT NULL,
    price        double precision      NOT NULL,
    quantity     integer               NOT NULL,
    last_updated bigint                NOT NULL
);


ALTER TABLE public.products
    OWNER TO "order-system";

--
-- Name: products_id_seq; Type: SEQUENCE; Schema: public; Owner: order-system
--

CREATE SEQUENCE public.products_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.products_id_seq
    OWNER TO "order-system";

--
-- Name: products_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: order-system
--

ALTER SEQUENCE public.products_id_seq OWNED BY public.products.id;


--
-- Name: cartitems id; Type: DEFAULT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.cartitems
    ALTER COLUMN id SET DEFAULT nextval('public.cartitems_id_seq'::regclass);


--
-- Name: carts id; Type: DEFAULT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.carts
    ALTER COLUMN id SET DEFAULT nextval('public.carts_id_seq'::regclass);


--
-- Name: clients id; Type: DEFAULT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.clients
    ALTER COLUMN id SET DEFAULT nextval('public.clients_id_seq'::regclass);


--
-- Name: orders id; Type: DEFAULT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.orders
    ALTER COLUMN id SET DEFAULT nextval('public.orders_id_seq'::regclass);


--
-- Name: products id; Type: DEFAULT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.products
    ALTER COLUMN id SET DEFAULT nextval('public.products_id_seq'::regclass);

--
-- Name: cartitems pk_cartitems_id; Type: CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.cartitems
    ADD CONSTRAINT pk_cartitems_id PRIMARY KEY (id);


--
-- Name: carts pk_carts_id; Type: CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.carts
    ADD CONSTRAINT pk_carts_id PRIMARY KEY (id);


--
-- Name: clients pk_clients_id; Type: CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.clients
    ADD CONSTRAINT pk_clients_id PRIMARY KEY (id);


--
-- Name: orders pk_orders_id; Type: CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT pk_orders_id PRIMARY KEY (id);


--
-- Name: products pk_products_id; Type: CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT pk_products_id PRIMARY KEY (id);


--
-- Name: cartitems fk_cartitems_product_id_id; Type: FK CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.cartitems
    ADD CONSTRAINT fk_cartitems_product_id_id FOREIGN KEY (product_id) REFERENCES public.products (id) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: orders fk_orders_cart_id_id; Type: FK CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT fk_orders_cart_id_id FOREIGN KEY (cart_id) REFERENCES public.carts (id) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: orders fk_orders_client_id_id; Type: FK CONSTRAINT; Schema: public; Owner: order-system
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT fk_orders_client_id_id FOREIGN KEY (client_id) REFERENCES public.clients (id) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- PostgreSQL database dump complete
--

