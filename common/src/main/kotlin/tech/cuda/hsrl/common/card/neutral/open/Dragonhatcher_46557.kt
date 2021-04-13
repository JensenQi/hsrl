package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dragonhatcher_46557 : Card() {
    override val id = 46557
    override val name = "驯龙师"
    override val description = "在你的回合结束时，<b>招募</b>一条龙。"
    override var cost: Int? = 9
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "到底是先有龙，还是先有驯龙师？"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2706cbce995b9757412666d68ddf022f6b5f2ae08a4cacc32baa28bbf9f5f3b0.png"
}
