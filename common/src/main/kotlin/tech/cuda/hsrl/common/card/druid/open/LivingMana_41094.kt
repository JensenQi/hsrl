package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LivingMana_41094 : Card() {
    override val id = 41094
    override val name = "活体法力"
    override val description = "将你所有的法力水晶变成2/2的树人，当它们死亡时恢复你的法力值。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "你追我，如果你追到我，我就让你放魔法。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d452fe8c839bfc05835f3e6c4846fb380ed3a94decdb5fd47f9c617336b0a8f2.png"
}
