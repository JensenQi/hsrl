package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GloopSprayer_48744 : Card() {
    override val id = 48744
    override val name = "黏液喷射者"
    override val description = "<b>战吼：</b> 为相邻的随从各召唤一个复制。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“加多少？200金币？”“加满！”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fd872918a7029e2563b8242191af754ea587bf41319e411f5728ab51528f180f.png"
}
