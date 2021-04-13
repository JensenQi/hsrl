package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimscaleOracle_68470 : Card() {
    override val id = 68470
    override val name = "暗鳞先知"
    override val description = "所有其他鱼人获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "这些算是有头脑的鱼人。但仍然有些名不副实。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc127c0f4eae59f360ce164dfa2540e10143dd9b4d3c59da929638f4c7081ff4.png"
}
