package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ToothyChest_43489 : Card() {
    override val id = 43489
    override val name = "利齿宝箱"
    override val description = "在你的回合开始时，将该随从的攻击力 变为4。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "你想吃冒险者吗？我想吃！"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2882b7070ab2deb83f6a058d3ff59a60dec0f5cba34529209393b69e97395cf.png"
}
