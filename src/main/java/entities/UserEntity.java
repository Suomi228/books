package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String name;

    public UserEntity(Long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Column(nullable = false)
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<BookCollectionEntity> bookCollections;

    @OneToMany(mappedBy = "user")
    private Set<PurchaseEntity> purchases;

    public UserEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<BookCollectionEntity> getBookCollections() {
        return bookCollections;
    }

    public void setBookCollections(Set<BookCollectionEntity> bookCollections) {
        this.bookCollections = bookCollections;
    }

    public Set<PurchaseEntity> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<PurchaseEntity> purchases) {
        this.purchases = purchases;
    }
}
