package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SecretPlan_48519 : Card() {
    override val id = 48519
    override val name = "奥秘图纸"
    override val description = "<b>发现</b>一张<b>奥秘</b>牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "秘密就是……根本没有计划！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6dc0bf688d087afd8b2fd9ab22a448760dd2dea0af51de4febfddb5c3cb7349a.png"
}
