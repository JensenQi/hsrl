package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JunglePanther_921 : Card() {
    override val id = 921
    override val name = "丛林猎豹"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "荆棘谷是一个很适合观光的地方，但你绝对不会想住在那儿。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4faa01dc3c941d613f7ba4042c46ad389c3e0b408fed6f5b3ae1e2dd73a88da8.png"
}
