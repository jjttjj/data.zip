{:namespaces
 ({:source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip/clojure.data.zip-api.html",
   :name "clojure.data.zip",
   :author "Chris Houser",
   :doc
   "System for filtering trees and nodes generated by zip.clj in\ngeneral, and xml trees in particular."}
  {:source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip/clojure.data.zip.xml-api.html",
   :name "clojure.data.zip.xml",
   :doc nil}),
 :vars
 ({:arglists ([loc]),
   :name "ancestors",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L62",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/ancestors",
   :doc
   "Returns a lazy sequence of all ancestors of location loc, starting\nwith loc and proceeding to loc's parent node and on through to the\nroot of the tree.",
   :var-type "function",
   :line 62,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "children",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L42",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/children",
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right.",
   :var-type "function",
   :line 42,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "children-auto",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L49",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/children-auto",
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right, marked so that a following tag= predicate will auto-descend.",
   :var-type "function",
   :line 49,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "descendants",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L57",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/descendants",
   :doc
   "Returns a lazy sequence of all descendants of location loc, in\ndepth-first order, left-to-right, starting with loc.",
   :var-type "function",
   :line 57,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "left-locs",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L30",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/left-locs",
   :doc
   "Returns a lazy sequence of locations to the left of loc, starting with loc.",
   :var-type "function",
   :line 30,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "leftmost?",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L34",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/leftmost?",
   :doc
   "Returns true if there are no more nodes to the left of location loc.",
   :var-type "function",
   :line 34,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "right-locs",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L26",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/right-locs",
   :doc
   "Returns a lazy sequence of locations to the right of loc, starting with loc.",
   :var-type "function",
   :line 26,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([loc]),
   :name "rightmost?",
   :namespace "clojure.data.zip",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L38",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/rightmost?",
   :doc
   "Returns true if there are no more nodes to the right of location loc.",
   :var-type "function",
   :line 38,
   :file "src/main/clojure/clojure/data/zip.clj"}
  {:arglists ([attrname] [loc attrname]),
   :name "attr",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L17",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/attr",
   :doc
   "Returns the xml attribute named attrname, of the xml node at location loc.",
   :var-type "function",
   :line 17,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([attrname attrval]),
   :name "attr=",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L22",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/attr=",
   :doc
   "Returns a query predicate that matches a node when it has an\nattribute named attrname whose value is attrval.",
   :var-type "function",
   :line 22,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([preds]),
   :name "seq-test",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L50",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/seq-test",
   :doc
   "Returns a query predicate that matches a node when its xml content\nmatches the query expresions given.",
   :var-type "function",
   :line 50,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([tagname]),
   :name "tag=",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L27",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/tag=",
   :doc
   "Returns a query predicate that matches a node when its is a tag\nnamed tagname.",
   :var-type "function",
   :line 27,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([loc]),
   :name "text",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L37",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/text",
   :doc
   "Returns the textual contents of the given location, similar to\nxpaths's value-of",
   :var-type "function",
   :line 37,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([s]),
   :name "text=",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L45",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/text=",
   :doc
   "Returns a query predicate that matches a node when its textual\ncontent equals s.",
   :var-type "function",
   :line 45,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([loc & preds]),
   :name "xml->",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L56",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/xml->",
   :doc
   "The loc is passed to the first predicate.  If the predicate returns\na collection, each value of the collection is passed to the next\npredicate.  If it returns a location, the location is passed to the\nnext predicate.  If it returns true, the input location is passed to\nthe next predicate.  If it returns false or nil, the next predicate\nis not called.\n\nThis process is repeated, passing the processed results of each\npredicate to the next predicate.  xml-> returns the final sequence.\nThe entire chain is evaluated lazily.\n\nThere are also special predicates: keywords are converted to tag=,\nstrings to text=, and vectors to sub-queries that return true if\nthey match.\n\nSee the footer of zip-query.clj for examples.",
   :var-type "function",
   :line 56,
   :file "src/main/clojure/clojure/data/zip/xml.clj"}
  {:arglists ([loc & preds]),
   :name "xml1->",
   :namespace "clojure.data.zip.xml",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj#L79",
   :raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip/xml.clj",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/xml1->",
   :doc
   "Returns the first item from loc based on the query predicates\ngiven.  See xml->",
   :var-type "function",
   :line 79,
   :file "src/main/clojure/clojure/data/zip/xml.clj"})}