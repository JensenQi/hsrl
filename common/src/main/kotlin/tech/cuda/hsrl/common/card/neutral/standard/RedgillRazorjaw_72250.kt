package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RedgillRazorjaw_72250 : Card() {
    override val id = 72250
    override val name = "红鳃锋颚战士"
    override val description = "<b>突袭</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "一条鱼，两条鱼，蓝鱼退场变红鱼。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93429fff2410d8572971f36b36caff1518595ab2ea94bad0266f101a0101fe3a.png"
}
