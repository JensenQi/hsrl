package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MirageCaller_41155 : Card() {
    override val id = 41155
    override val name = "幻象制造者"
    override val description = "<b>战吼：</b>选择一个友方随从，召唤一个它的1/1复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "闲暇时他会召唤一个幻象来陪自己玩炉石。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9192ce25e2908b06b699d0520b2dfeb05161ae9557fced34839a37b59e92e8c1.png"
}
