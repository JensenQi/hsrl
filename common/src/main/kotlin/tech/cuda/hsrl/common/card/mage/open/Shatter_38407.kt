package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shatter_38407 : Card() {
    override val id = 38407
    override val name = "冰爆"
    override val description = "消灭一个被<b>冻结</b>的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "想来杯慕斯冰沙吗？稍等片刻！"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d17588ed30b8d452f5bc6f4bbd1fb70154b44163e9a74d0536e2aec584d0a536.png"
}
