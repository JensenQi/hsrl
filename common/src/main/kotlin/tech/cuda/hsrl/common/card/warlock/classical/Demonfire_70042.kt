package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demonfire_70042 : Card() {
    override val id = 70042
    override val name = "恶魔之火"
    override val description = "对一个随从造成 2点伤害，如果该随从是友方恶魔，则改为使其获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "恶魔之火和普通火焰没什么区别，除了它从来不会熄灭...救命！"
    override val artist = "Ben Wootten"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/08c788ec0c705a59f9ee6123d3f550ddc495a63f89a4581ac8844ce378c7b961.png"
}
