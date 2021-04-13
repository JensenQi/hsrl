package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverwareGolem_39380 : Card() {
    override val id = 39380
    override val name = "镀银魔像"
    override val description = "如果你弃掉了这张随从牌，则会召唤它。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Karazhan
    override val background = "听说镀银魔像是由设计出侏儒军刀的神秘部门研发而成的。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51999a15a5d55b228ea63c4463ea5d74164458749a1840ce45ebb9a75e16d1a9.png"
}
