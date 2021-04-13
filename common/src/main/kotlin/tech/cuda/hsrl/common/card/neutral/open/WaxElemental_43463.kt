package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WaxElemental_43463 : Card() {
    override val id = 43463
    override val name = "蜡油元素"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "蜡烛制的武器可以对其造成双倍伤害。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b59e57bcbcc7dcc0453b66bc466e290eed7c9b5a9b277b2a0fc1426c93f51d55.png"
}
