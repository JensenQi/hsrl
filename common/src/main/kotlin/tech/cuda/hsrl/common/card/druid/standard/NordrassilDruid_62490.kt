package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NordrassilDruid_62490 : Card() {
    override val id = 62490
    override val name = "诺达希尔德鲁伊"
    override val description = "<b>战吼：</b>在本回合中，你施放的下一个法术的法力值消耗减少（3）点。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "世界之树诺达希尔给这个世界带来了生命的能量。还能节省法力值。"
    override val artist = "Dave Greco"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/096005936d49cd173989c6745a84351afff2028c5b67a9b651f37fc3fe8ed2f0.png"
}
