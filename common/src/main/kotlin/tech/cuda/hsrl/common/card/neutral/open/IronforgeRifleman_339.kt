package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronforgeRifleman_339 : Card() {
    override val id = 339
    override val name = "铁炉堡火枪手"
    override val description = "<b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“准备！瞄准！干杯！”"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2646cadbb622a9d4723a33332b45013b22a859c4f0da4987178f938ec4ace05.png"
}
