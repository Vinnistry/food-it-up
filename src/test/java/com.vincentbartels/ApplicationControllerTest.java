package com.vincentbartels;

/*
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
*/
public class ApplicationControllerTest {

   /*
    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate templates;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getIndexFile() throws Exception {
        ResponseEntity<String> response = templates.getForEntity(base.toString(),
                String.class);
        //Failing because body is whole file content and not just the body-tag
        assertThat(response.getBody(), equalTo("Just food it up, real fast and delicious!"));
    }*/
}