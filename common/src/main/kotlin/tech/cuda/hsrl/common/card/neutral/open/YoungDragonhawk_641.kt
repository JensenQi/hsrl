package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YoungDragonhawk_641 : Card() {
    override val id = 641
    override val name = "幼龙鹰"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "无论是战士还是诗人，都能从美丽的龙鹰身上获取战斗或是写作的灵感。"
    override val artist = "Greg Hildebrandt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad2c40ea4c7aa87f93359e4fb7e29666ec6404e906c8411eedfef78317f5eeef.png"
}
