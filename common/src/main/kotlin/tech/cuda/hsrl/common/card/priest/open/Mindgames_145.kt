package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mindgames_145 : Card() {
    override val id = 145
    override val name = "控心术"
    override val description = "随机将你对手的牌库中的一张随从牌的复制置入战场。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "有时候你会觉得，一切不过是场游戏。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6523f1e90ae9cd17ab5d87e415eaeaf128957ae762c1c3c38c13b632986d9244.png"
}
