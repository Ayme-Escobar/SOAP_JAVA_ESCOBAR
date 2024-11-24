import hashlib

def hash_password(password):
    return hashlib.sha256(password.encode('utf-8')).hexdigest()

def main():
    print("=== Prueba de Generación de Hash SHA-256 ===\n")

    password = input("Ingrese una contraseña para generar su hash: ")
    
    hash_generado = hash_password(password)

    print(f"\nHash generado para la contraseña '{password}':")
    print(hash_generado)

    hash_almacenado = hash_password("Monster9")
    if hash_generado == hash_almacenado:
        print("\nEl hash generado coincide con el hash de la contraseña 'Monster9'.")
    else:
        print("\nEl hash generado NO coincide con el hash de la contraseña 'Monster9'.")

if __name__ == "__main__":
    main()
