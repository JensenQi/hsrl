package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorruptingMist_41871 : Card() {
    override val id = 41871
    override val name = "腐化迷雾"
    override val description = "诅咒所有随从，在你的下个回合开始时将其消灭。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "寂静的山岭荒无人烟，恐怖的阴霾无处不在。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c2b2279989dfbe39cbf38e8e496a2046c901df6f5061aa19709edaa55543eb6.png"
}
