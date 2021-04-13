package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ToxicSewerOoze_40921 : Card() {
    override val id = 40921
    override val name = "毒性污水软泥怪"
    override val description = "<b>战吼：</b>使对手的武器失去1点耐久度。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "这就是你把法力水晶冲下马桶的结果！"
    override val artist = "Anton Kagounkina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/372a681505a6507963115efe32e4e71b73840de34bb98fd8fe6f76b5b859eb77.png"
}
