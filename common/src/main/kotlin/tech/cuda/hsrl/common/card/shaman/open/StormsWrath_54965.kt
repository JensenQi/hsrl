package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormsWrath_54965 : Card() {
    override val id = 54965
    override val name = "风暴之怒"
    override val description = "使你的所有随从获得+1/+1。 <b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "要摧毁一个热气球，需要几条巨龙？一，二，三，嘭！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e26943bc2a379d3bd8db83347a8ada245ea65b41de1c438dcca78aeec26d16b.png"
}
