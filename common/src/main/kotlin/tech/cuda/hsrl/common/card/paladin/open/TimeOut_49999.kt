package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TimeOut_49999 : Card() {
    override val id = 49999
    override val name = "暂避锋芒"
    override val description = "直到你的下个回合，你的英雄获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "这就是……圣骑士的绝对领域吗？！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a81fd9c2c5db2fa3e3431b6d2a61d5e1cac42eb0719cde6033764aefe3156ae4.png"
}
