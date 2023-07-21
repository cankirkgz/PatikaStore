<h1>Java Electronics Store Management System</h1>
    <p>This is a simple command-line based Electronics Store Management System implemented in Java. The program allows users to manage a list of telephones and notebooks with various features like adding new products, deleting products, and listing available products by brand and type.</p>

   <h2>Features</h2>
   <ol>
        <li>List Brands: View a sorted list of all available brands in the store.</li>
        <li>List Telephones: Display a tabulated list of all available telephones with their details.</li>
        <li>List Notebooks: Display a tabulated list of all available notebooks with their details.</li>
        <li>Add Product: Add a new telephone or notebook to the store's inventory.</li>
        <li>Delete Product: Remove a telephone or notebook from the inventory.</li>
    </ol>

   <h2>How to Use</h2>
   <ol>
        <li>Clone the repository to your local machine.</li>
        <li>Make sure you have Java installed on your system.</li>
        <li>Compile the program using any Java compiler or IDE.</li>
        <li>Run the <code>Main</code> class to start the Electronics Store Management System.</li>
    </ol>

   <h2>Data Structure</h2>
   <h3>Brand Class</h3>
   <p>The <code>Brand</code> class represents a brand for electronic devices. It contains a unique ID and a brand name.</p>

   <h3>Devices Class</h3>
   <p>The <code>Devices</code> class is an abstract class that represents electronic devices like telephones and notebooks. It contains common attributes like ID, unit price, discount rate, stock amount, product name, brand, RAM, memory, and screen size. It also includes an inner class <code>UniqueIDGenerator</code> to generate unique IDs for devices.</p>

   <h3>Telephone Class</h3>
   <p>The <code>Telephone</code> class extends the <code>Devices</code> class and represents a telephone. It has additional attributes specific to telephones like battery power and color.</p>

   <h3>Notebook Class</h3>
   <p>The <code>Notebook</code> class also extends the <code>Devices</code> class and represents a notebook. It has attributes specific to notebooks.</p>

   <h2>Adding Products</h2>
   <ol>
        <li>Select the type of product you want to add (Telephone or Notebook).</li>
        <li>Provide the required attributes for the selected product type like brand, model, price, discount, stock, memory, RAM, size, battery (for telephones), and color (for telephones).</li>
        <li>The new product will be added to the store's inventory.</li>
    </ol>

  <h2>Deleting Products</h2>
   <ol>
        <li>Select the type of product you want to delete (Telephone or Notebook).</li>
        <li>View the list of available products of the selected type along with their details.</li>
        <li>Enter the ID of the product you want to delete.</li>
        <li>The selected product will be removed from the store's inventory.</li>
    </ol>

   <h2>Contributing</h2>
   <p>This project is open to contributions. If you find any bugs or have suggestions for improvements, feel free to submit a pull request.</p>

  <h2>License</h2>
   <p>This project is licensed under the MIT License - see the <code>LICENSE</code> file for details.</p>

   <h2>Acknowledgments</h2>
   <p>This project was created as a learning exercise for Java programming.</p>
