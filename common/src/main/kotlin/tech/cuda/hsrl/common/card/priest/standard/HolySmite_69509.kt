package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolySmite_69509 : Card() {
    override val id = 69509
    override val name = "神圣惩击"
    override val description = "对一个随从造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "这和多么虔诚没有关系，每个人都需要时不时有人鞭策一下。"
    override val artist = "Steve Ellis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b0fbd4a7d495a953ec56f39a7c11d5658b7d847b5c5951cbf91517a88976dbe.png"
}
