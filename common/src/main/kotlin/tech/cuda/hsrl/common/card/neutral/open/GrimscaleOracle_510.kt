package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimscaleOracle_510 : Card() {
    override val id = 510
    override val name = "暗鳞先知"
    override val description = "你的其他鱼人获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "这些算是有头脑的鱼人。但仍然有些名不副实。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65ab362547ddd1a6dbd54bd54dbb490b4b202908894f07f420e25e91b6b53261.png"
}
