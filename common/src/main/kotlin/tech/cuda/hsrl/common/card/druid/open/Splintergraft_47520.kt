package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Splintergraft_47520 : Card() {
    override val id = 47520
    override val name = "碎枝"
    override val description = "<b>战吼：</b>选择一个友方随从。将它的一张10/10复制置入你的手牌，其法力值消耗为（10）点。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "我们需要一些超大号的修剪钳。"
    override val artist = "Craig Elliott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1735d14477fe921ae818e01dea8fed332e5743056363c77f2ca4ea33cb949fd6.png"
}
