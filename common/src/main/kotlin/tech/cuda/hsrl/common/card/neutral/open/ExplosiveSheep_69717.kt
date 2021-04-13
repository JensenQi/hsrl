package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveSheep_69717 : Card() {
    override val id = 69717
    override val name = "自爆绵羊"
    override val description = "<b>亡语：</b>对所有随从造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "这项武器究竟应该怎么使用？让你的敌人觉得它很可爱然后指望他会把它抱起来？"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1db1f2b51675f5dc8e3a71077528863d9a9e3dc881f30849ac7596c66f800773.png"
}
