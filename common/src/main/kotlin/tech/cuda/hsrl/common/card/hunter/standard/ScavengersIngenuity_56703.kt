package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScavengersIngenuity_56703 : Card() {
    override val id = 56703
    override val name = "拾荒者的智慧"
    override val description = "抽一张野兽牌。使其获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“一头奄奄一息的野兽。先生们，我们可以将其重塑！让它变得更强，更快……更扎手。”"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/484fb46ed3af32ec1cbf97040eceb7e9237b8c4c15e775a3fa4f962b01ce2deb.png"
}
