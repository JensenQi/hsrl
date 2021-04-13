package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwampLeech_47072 : Card() {
    override val id = 47072
    override val name = "沼泽水蛭"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "除去四颗牙，都是高蛋白。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83f1c3a0074b8aa4b2c145299e4a7ee59e8cfff383f2cb666d9ae3fd9d201074.png"
}
