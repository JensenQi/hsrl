package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuffRunetotem_63227 : Card() {
    override val id = 63227
    override val name = "古夫·符文图腾"
    override val description = "在你施放一个自然法术后，使另一个友方随从获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“天上日月成对，地上印记成双，还有身边队友，一同为我领航。”——古夫·符文图腾"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/abc4e1e332f057342402de2f3e0d4be49bc15137a02422644ed4b0aa67229d3c.png"
}
