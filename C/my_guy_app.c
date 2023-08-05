#include <gtk/gtk.h>

// Callback function for the "clicked" signal of the button
void on_button_clicked(GtkWidget *widget, gpointer data)
{
    g_print("Button clicked!\n");
}

int main(int argc, char *argv[])
{
    // Initialize GTK
    gtk_init(&argc, &argv);

    // Create the main window
    GtkWidget *window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
    gtk_window_set_title(GTK_WINDOW(window), "GTK Example");
    gtk_container_set_border_width(GTK_CONTAINER(window), 10);

    // Create a button
    GtkWidget *button = gtk_button_new_with_label("Click Me!");
    g_signal_connect(button, "clicked", G_CALLBACK(on_button_clicked), NULL);

    // Add the button to the window
    gtk_container_add(GTK_CONTAINER(window), button);

    // Show all widgets
    gtk_widget_show_all(window);

    // Start the main GTK loop
    gtk_main();

    return 0;
}

