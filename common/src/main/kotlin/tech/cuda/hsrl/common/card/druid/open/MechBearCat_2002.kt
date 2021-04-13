package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MechBearCat_2002 : Card() {
    override val id = 2002
    override val name = "机械野兽"
    override val description = "每当该随从受到伤害，将一张<b>零件</b>牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "这野兽的爪子和刀剑一样锋利，因为它本来就是由钢铁制成的。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4489f051c8da9472b98bf8e26d80f2434cd99af34db5d5df6cce2d70a9a4035.png"
}
