package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JunglePanther_69657 : Card() {
    override val id = 69657
    override val name = "丛林猎豹"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "荆棘谷是一个很适合观光的地方，但你绝对不会想住在那儿。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0122189c47a5e8373e11531f48e2e82fe0ea29f39959b6a209a6058174fd1cf3.png"
}
