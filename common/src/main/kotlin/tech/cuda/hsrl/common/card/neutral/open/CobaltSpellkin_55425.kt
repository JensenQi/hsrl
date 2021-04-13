package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CobaltSpellkin_55425 : Card() {
    override val id = 55425
    override val name = "深蓝系咒师"
    override val description = "<b>战吼：</b>随机将两张你职业的法力值消耗为（1）的法术牌置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "乱喷出来的咒语比说梦话的巫师念的还多。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/799018396c1d64f2adf1464742e3620f664739a0e68c9bf37c1efd2e8cf12739.png"
}
