<%@page import="sample.ticket.TicketDTO"%> <%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <!-- Tailwind -->
   <script src="https://cdn-tailwindcss.vercel.app/"></script>
   <link
     rel="stylesheet"
     href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
   />
   <link
     href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.css"
     rel="stylesheet"
   />
   <link href="./css/tailwind.css" rel="stylesheet" />
   <link
     rel="stylesheet"
     href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css"
   />
   <script
     src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.js"
     defer
   ></script>
   <script
     src="https://kit.fontawesome.com/5b0b34b925.js"
     crossorigin="anonymous"
   ></script>
    <title>Ticket</title>
  </head>
  <body action="TicketController">
    <div>
      <div x-data="{ sidebarOpen: false }" class="flex h-screen bg-gray-200">
        <!-- prettier-ignore -->
        <%@ include file="components/sidebaradmin.html" %>
        <div class="flex flex-col flex-1 overflow-hidden">
               <!-- header -->
             <!-- prettier-ignore -->
             <%@ include file="components/headeradmin.html" %>
          <main class="flex-1 overflow-x-hidden bg-gray-200">
            <div class="container px-6 py-8 mx-auto">
              <!--  -->
              <div class="flex justify-between">
                <h3 class="text-3xl font-medium text-gray-700">Ticket List</h3>
                <!-- end view order -->
              </div>
              <!--  -->
              <!-- main -->
              <div class="flex flex-col mt-8">
                <div
                  class="-mx-4 sm:-mx-8 px-4 sm:px-8 overflow-x-hidden overflow-y-hidden"
                >
                  <% List<TicketDTO> listTicket = (List<TicketDTO>) session.getAttribute("LIST_TICKET"); 
                      if (listTicket != null && listTicket.size() > 0) { %>
                  <!-- table -->
                  <div
                    class="inline-block min-w-full overflow-hidden align-middle border-b border-gray-200 shadow sm:rounded-lg"
                  >
                    <table class="min-w-full">
                      <thead class="bg-neutral-100">
                        <tr class="bg-blue-500 text-white">
                          <th
                            class="px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50"
                          >
                            ID
                          </th>
                          <th
                            class="px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50"
                          >
                            Type
                          </th>
                          <th
                            class="px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50"
                          >
                            Price
                          </th>

                          <th
                            class="px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50"
                          >
                            Discount
                          </th>
                          <th
                            class="px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50"
                          >
                            Price Main
                          </th>
                          <th
                            class="px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50"
                          >
                            Action
                          </th>
                        </tr>
                      </thead>

                      <% for (TicketDTO ticket : listTicket) { %>

                      <tbody class="bg-white">
                        <td
                          class="px-6 py-4 whitespace-no-wrap border-b border-gray-200"
                        >
                          <%= ticket.getTicket_ID()%>
                        </td>

                        <td
                          class="px-6 py-4 whitespace-no-wrap border-b border-gray-200"
                        >
                          <%= ticket.getTicket_Name()%>
                        </td>
                        <td
                          class="px-6 py-4 whitespace-no-wrap border-b border-gray-200"
                        >
                          <%= ticket.getPrice()%>
                        </td>
                        <form action="TicketController">
                          <td>
                            <label for="integerInput">DISCOUNT:</label>
                            <input
                              type="number"
                              name="Discount"
                              id="integerInput"
                              value="<%= ticket.getDiscount()%>"
                              required
                              min="0"
                              max="100"
                            /><br />
                          </td>

                          <td><%= ticket.getPrice_Main()%></td>
                          <td>
                            <input
                              type="hidden"
                              name="ID_Ticket"
                              value="<%= ticket.getTicket_ID()%> "
                            />
                            <input
                              type="submit"
                              name="action"
                              name="Update_Discount"
                              value="Update_Discount"
                            />
                          </td>
                        </form>
                        <% } }%>
                      </tbody>
                    </table>
                    <% String error = (String) request.getAttribute("ERROR"); if
                    (error == null) { error = ""; } %>

                    <h2><%= error%></h2>
                  </div>
                </div>
              </div>
            </div>
          </main>
        </div>
      </div>
    </div>
  </body>
</html>
